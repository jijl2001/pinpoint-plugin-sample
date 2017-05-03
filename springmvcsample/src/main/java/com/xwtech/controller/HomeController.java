package com.xwtech.controller;

import com.navercorp.plugin.sample.target.TargetClass02;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by jason on 2017/5/3.
 */
@Controller
@RequestMapping(value = "home")
public class HomeController {

    @RequestMapping(value = "/test")
    public ModelAndView login(HttpServletRequest request, HttpServletResponse response) {

        TargetClass02 targetClass02 = new TargetClass02();
        String ss = targetClass02.targetMethod("Hello World!1");
        System.out.println(ss);

        TargetClass02 targetClass022 = new TargetClass02();
        ss = targetClass022.targetMethod("Hello World!2");
        System.out.println(ss);

        TargetClass02 targetClass023 = new TargetClass02();
        ss = targetClass023.targetMethod("Hello World!3");
        System.out.println(ss);

        ModelAndView mv = new ModelAndView("test");
        return mv;
    }
}
