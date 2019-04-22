package com.wg.www.controller;

import com.google.common.collect.Maps;
import com.wg.www.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/login")
    public Map<String,Object> login(@RequestParam String username,
                                    @RequestParam String password){
        Map<String,Object> map= Maps.newHashMap();
        map.put("flag",userService.checkLogin(username,password));
        return map;
    }
}
