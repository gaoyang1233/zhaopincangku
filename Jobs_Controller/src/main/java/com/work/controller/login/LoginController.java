package com.work.controller.login;

import com.work.common.util.CookieUtil;
import com.work.common.vo.R;
import com.work.service.user.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class LoginController {

    @Autowired
    private LoginService loginService;

    /**
     * @Description //TODO 
     * @Date 20:18 2018/9/10 0010
     * @Param [name, password, request, response]
     * @return com.hyq.common.result.Result
     **/
    @RequestMapping("/ssoLogin.do")
    public R ssoLogin(String name, String password, HttpServletRequest request, HttpServletResponse response) {
        String token = CookieUtil.getCk(request,"userauth");
        if (token == null) {
            R result = loginService.login(name,password);
            if (result.getCode() == 1001) {
                //如果登录成功,将令牌存到cookie
                CookieUtil.setCK(response,"userauth",result.getData().toString());
            }
            return result;
        } else {
            return loginService.checkLogin(token);
        }
    }

    @RequestMapping("/checkLogin.do")
    public R checkLogin(HttpServletRequest request, HttpServletResponse response) {

        String token = CookieUtil.getCk(request,"userauth");
        if (token != null) {
            return loginService.checkLogin(token);
        } else {
            return R.error();
        }
    }

    @RequestMapping("/loginout.do")
    public R loginout(HttpServletRequest request, HttpServletResponse response) {

        String token = CookieUtil.getCk(request,"userauth");
        CookieUtil.delCK(response,"userauth");
        return loginService.loginout(token);
    }
}
