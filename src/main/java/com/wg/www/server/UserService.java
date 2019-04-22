package com.wg.www.server;

import com.wg.www.domain.User;

public interface UserService {

    Boolean checkLogin(String username,String password);

    User getUserInfo(Integer id);
}
