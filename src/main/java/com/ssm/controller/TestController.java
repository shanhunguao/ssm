package com.ssm.controller;

import com.ssm.entity.User;
import com.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author zhouhuangfan
 * @data 2019-5-27 0027
 */
@Controller
public class TestController {
    @Autowired
    private UserService userService;

    @RequestMapping("/index")
    public String test() {
        return "index";
    }

    @RequestMapping("/find")
    @ResponseBody
    public User find() {
        return userService.find();
    }
}
