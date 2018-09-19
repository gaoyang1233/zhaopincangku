package com.work.mapper.user;

import com.work.domain.user.Login;

public interface LoginMapper {
    //用户登录
    Login selectByUsernameOrEmail(String name);
}