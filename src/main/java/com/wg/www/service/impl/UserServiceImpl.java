package com.wg.www.service.impl;

import com.wg.www.domain.User;
import com.wg.www.mapper.UserMapper;
import com.wg.www.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public Boolean checkLogin(String username, String password) {
        User user =userMapper.selectByUsername(username);
        if(user!=null&&user.getPassword().equals(password)){
            return true;
        }
        return false;
    }

    @Override
    public User getUserInfo(Integer id) {
        return userMapper.selectById(id);
    }
}
