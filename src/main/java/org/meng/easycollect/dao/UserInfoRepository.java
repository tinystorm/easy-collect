package org.meng.easycollect.dao;

import org.meng.easycollect.bean.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Meng
 */
public interface UserInfoRepository extends JpaRepository<UserInfo, String> {

    /**
     * 根据用户名查询用户信息
     * @param username 用户名
     * @return 用户信息
     */
    UserInfo findByUsername(String username);
}
