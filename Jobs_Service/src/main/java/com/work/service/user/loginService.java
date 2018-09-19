package com.work.service.user;


import com.work.common.vo.R;
import com.work.domain.user.Login;

/**
 * @Author:Johnny
 * @Date: 2018/9/16 0016 下午 21:57
 */
public interface LoginService {
    //登录
    R login(String name, String password);

    //校验是否登录
    R checkLogin(String token);

    //退出登录  token 传入令牌
    R loginout(String token);
}
