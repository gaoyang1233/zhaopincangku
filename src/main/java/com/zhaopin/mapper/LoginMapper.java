package com.zhaopin.mapper;

import com.zhaopin.pojo.Login;

public interface LoginMapper {
    //用户名登录
    Login login(String username);
    //邮箱登录
    Integer selectByEmail(String email);
    //验证用户名是否存在

    }