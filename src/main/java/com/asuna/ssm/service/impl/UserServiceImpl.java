package com.asuna.ssm.service.impl;

import com.asuna.ssm.mapper.UserMapper;
import com.asuna.ssm.pojo.User;
import com.asuna.ssm.service.UserService;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private SqlSessionFactory sqlSessionFactory;

    @Autowired
    private UserMapper userMapper;

    @Override
    public User checkUser(User user){
        return userMapper.checkUser(user);
    }
}
