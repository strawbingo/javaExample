package com.strawbingo.dao;

/**
 * Created by liubin15 on 2019/2/2.
 */

import com.strawbingo.entity.UserInfo;
import org.springframework.data.repository.CrudRepository;

public interface UserInfoDao extends CrudRepository<UserInfo,Long> {
    /**通过username查找用户信息;*/
    public UserInfo findByUsername(String username);
}

