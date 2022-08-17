package com.asuna.ssm.service;

import com.asuna.ssm.pojo.User;

public interface UserService {

    /**
     * 验证账号信息 登录
     */
    User checkUser(User user);
}
