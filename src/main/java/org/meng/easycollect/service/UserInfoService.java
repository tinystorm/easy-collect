package org.meng.easycollect.service;

import org.meng.easycollect.bean.entity.UserInfo;

/**
 * @author meng
 */
public interface UserInfoService {

    /**
     * 通过oauth2.0 server返回的code查询用户信息
     * @param code oauth2.0 server返回的code
     * @return 用户信息
     */
    UserInfo findUserInfo(String code);
}
