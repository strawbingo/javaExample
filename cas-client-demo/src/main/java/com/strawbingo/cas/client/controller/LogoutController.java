package com.strawbingo.cas.client.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * Created by liubin15 on 2019/1/24.
 */
@Controller
public class LogoutController {
    @RequestMapping("/logoutDefault")
    public String logout1(HttpSession session) {
        session.invalidate();

        // 直接退出，走默认退出方式
        return "redirect:https://cas.example.org:8443/cas/logout";
    }

    @RequestMapping("/logoutCustom")
    public String logout2(HttpSession session) {
        session.invalidate();
        // 退出登录后，跳转到退出成功的页面，不走默认页面
        return "redirect:https://cas.example.org:8443/cas/logout?service=http://cas.client.com:8001/logout/success";
    }

    @RequestMapping("/logout/success")
    @ResponseBody
    public String logout2() {
        return "系统1注销成功";
    }
}