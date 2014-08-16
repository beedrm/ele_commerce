package com.team.eb.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.team.common.controller.CommonController;
import com.team.eb.entity.LoginForm;
import com.team.eb.service.LoginFormService;

 @Controller
 public class Login2Controller extends CommonController<LoginForm>{
	 public static void main(String[] args) {
		Login2Controller l2c=new Login2Controller();
		System.out.println(l2c.getEntity());
	}
 }