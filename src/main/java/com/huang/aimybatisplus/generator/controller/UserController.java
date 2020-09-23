package com.huang.aimybatisplus.generator.controller;


import com.huang.aimybatisplus.generator.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author huang
 * @since 2020-09-23
 */
@Controller
@RequestMapping("/generator/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/index")
    public ModelAndView index(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        modelAndView.addObject("list", userService.list());
        return modelAndView;
    }
}

