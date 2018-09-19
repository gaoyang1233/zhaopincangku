package com.work.serviceimpl.user;


import com.alibaba.fastjson.JSON;
import com.work.common.util.EncrypUtil;
import com.work.common.util.JedisUtil;
import com.work.common.vo.R;
import com.work.domain.user.Login;
import com.work.mapper.user.LoginMapper;
import com.work.service.user.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private LoginMapper loginMapper;

    @Autowired
    private JedisUtil jedisUtil;

    @Override
    public R login(String name, String password) {
        Login login = loginMapper.selectByUsernameOrEmail(name);
        if (login!= null) {
            if(login.getFlag() == 1) {
                if (Objects.equals(login.getPassword(),password)) {
                    //登录成功
                    //生成令牌
                    String token = EncrypUtil.md5Pass(login.getId().toString(),name);
                    //存储登录信息到Redis
                    jedisUtil.addStr(token, JSON.toJSONString(login),TimeUnit.MINUTES,30);

                    return new R(1001,"登录成功",token);
                } else {
                    return new R(1002,"密码不正确");
                }
            } else {
                return new R(1003,"用户未激活");
            }

        }
        return new R(1004,"用户不存在");
    }

    @Override
    public R checkLogin(String token) {
        if (jedisUtil.isKey(token)) {
            String json = jedisUtil.getStr(token);
            jedisUtil.expire(token,TimeUnit.MINUTES,30);
            return new R(1001,"success",JSON.parseObject(json,Login.class));
        } else {
            return R.error();
        }
    }

    @Override
    public R loginout(String token) {
        //删除Redis
        jedisUtil.delKey(token);
        return R.ok();
    }
}
