package com.work.serviceimpl.shiro;


import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

public class loginShiro extends AuthorizingRealm {



    //授权--提供当前用户的权限和角色
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        return info;
    }

    //认证----登录校验
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        //获取令牌
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        //外界已经进行过登录校验，此处只需要进行对象封装
        if (token.getUsername().length() > 0) {
            SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(token.getUsername(),token.getPassword(),getName());
            return info;
        }

        return null;
    }
}
