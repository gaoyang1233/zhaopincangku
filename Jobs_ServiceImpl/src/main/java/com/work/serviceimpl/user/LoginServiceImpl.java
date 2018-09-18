package com.work.serviceimpl.user;


import com.work.common.util.ShiroEncryUtil;
import com.work.domain.user.Login;
import com.work.mapper.user.LoginMapper;
import com.work.service.user.loginService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Objects;

/**
 * @Author:Johnny
 * @Date: 2018/9/16 0016 下午 22:00
 */
public class LoginServiceImpl implements loginService {
    @Autowired
    private LoginMapper mapper;
    @Override
    public Login login(String username, String password) {
        Login login = mapper.login(username);
        if(login!=null){
            if (Objects.equals(login.getPassword(),ShiroEncryUtil.md5(password)))
        return login;
        }
        return null;
    }

    @Override
    public boolean selectByEmail(String email) {
        Integer temp = mapper.selectByEmail(email);
        if (temp!=null && temp>0){
            return true;
        }else{
            return false;
        }
    }
}
