package com.work.service.user;


import com.work.domain.user.Login;

/**
 * @Author:Johnny
 * @Date: 2018/9/16 0016 下午 21:57
 */
public interface loginService {
    Login login(String username, String password);
    boolean selectByEmail(String email);
}
