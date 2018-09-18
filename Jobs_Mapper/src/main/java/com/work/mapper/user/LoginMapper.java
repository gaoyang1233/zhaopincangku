package com.work.mapper.user;

import com.work.domain.user.Login;

public interface LoginMapper {
    //用户名登录
    Login login(String username);
    //邮箱登录
    Integer selectByEmail(String email);
    //验证用户名是否存在

    }