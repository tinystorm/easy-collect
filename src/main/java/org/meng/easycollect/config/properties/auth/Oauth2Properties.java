package org.meng.easycollect.config.properties.auth;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * Oauth2客户端属性
 *
 * @author Meng
 */
@Data
@PropertySource("classpath:github-auth.properties")
@ConfigurationProperties(prefix = "github")
@Component
public class Oauth2Properties {
    private String clientId;
    private String clientSecret;
    private String authorizeUrl;
    private String redirectUrl;
    private String accessTokenUrl;
    private String userInfoUrl;
    private String homePage;
}
