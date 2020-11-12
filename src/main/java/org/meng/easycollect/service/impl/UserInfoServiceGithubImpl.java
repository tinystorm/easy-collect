package org.meng.easycollect.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.meng.easycollect.bean.entity.UserInfo;
import org.meng.easycollect.bean.rsp.AccessTokenResponse;
import org.meng.easycollect.config.properties.auth.Oauth2Properties;
import org.meng.easycollect.service.UserInfoService;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


/**
 * @author meng
 */
@Service
@Slf4j
public class UserInfoServiceGithubImpl implements UserInfoService {
    private final RestTemplate restTemplate;
    private final Oauth2Properties oauth2Properties;

    public UserInfoServiceGithubImpl(RestTemplate restTemplate, Oauth2Properties oauth2Properties) {
        this.restTemplate = restTemplate;
        this.oauth2Properties = oauth2Properties;
    }

    /**
     * 从github获取认证后的用户信息
     *
     * @param code
     * @return
     */
    @Override
    public UserInfo findUserInfo(String code) {
        String url = oauth2Properties.getAccessTokenUrl() +
                "?client_id=" + oauth2Properties.getClientId() +
                "&client_secret=" + oauth2Properties.getClientSecret() +
                "&code=" + code +
                "&grant_type=authorization_code";
        log.info("getAccessToken url:{}", url);
        HttpHeaders requestHeaders = new HttpHeaders();
        // 指定响应返回json格式
        requestHeaders.add("accept", "application/json");
        // 构建请求实体
        HttpEntity<String> requestEntity = new HttpEntity<>(requestHeaders);
        AccessTokenResponse result = restTemplate.postForObject(url, requestEntity, AccessTokenResponse.class);
        if (result == null) {
            throw new RuntimeException("查询出错");
        }
        log.info("result:{}", result);
        // AccessToken放在请求头中
        requestHeaders.add("Authorization", "token " + result.getAccessToken());
        requestEntity = new HttpEntity<>(requestHeaders);
        // get请求方式
        ResponseEntity<String> response = restTemplate.exchange(oauth2Properties.getUserInfoUrl(), HttpMethod.GET, requestEntity, String.class);

        String userInfo = response.getBody();
        log.info("userInfo={}", userInfo);
        //存入session即可
        return null;
    }
}
