package org.meng.easycollect.controller;

import lombok.extern.slf4j.Slf4j;
import org.meng.easycollect.bean.auth.Oauth2Properties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 登录
 *
 * @author Meng
 */
@Slf4j
@Controller
public class LoginController {
    private final Oauth2Properties oauth2Properties;

    public LoginController(Oauth2Properties oauth2Properties) {
        this.oauth2Properties = oauth2Properties;
    }

    @GetMapping("/login")
    public String login() {
        return "view/login";
    }

    @GetMapping("oauth2/auth")
    public String auth() {
        String url = oauth2Properties.getAuthorizeUrl() +
                "?client_id=" + oauth2Properties.getClientId() +
                "&redirect_uri=" + oauth2Properties.getRedirectUrl();
        log.info("授权url:{}", url);
        return "redirect:" + url;
    }

    @GetMapping("oauth2/callback")
    public String callback(@RequestParam("code") String code) {
        log.info("login code:{}", code);
        return String.format("redirect:%s", oauth2Properties.getHomePage());
    }


}
