package com.team.eb.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.team.eb.entity.LoginForm;
import com.team.eb.service.LoginFormService;

 @Controller
 public class LoginController {
	 @Autowired
	 private LoginFormService lfService;
     @RequestMapping(value="login")
     public ModelAndView login(HttpServletRequest request,HttpServletResponse response,LoginForm command ){
         String username = command.getUsername();
         LoginForm lf=new LoginForm();
         lf.setId(1);
         lf.setUsername(username);
         lf.setPassword("123456");
         lfService.saveE(lf);
         ModelAndView mv = new ModelAndView("/index/index","command","LOGIN SUCCESS, " + username);
         return mv;
     }
 }