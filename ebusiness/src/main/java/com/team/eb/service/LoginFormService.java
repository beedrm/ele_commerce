package com.team.eb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.team.eb.dao.LoginFormDao;
import com.team.eb.entity.LoginForm;

@Service
@Transactional(readOnly = true)
public class LoginFormService {
	@Autowired
	private LoginFormDao loginFormDao;
	
	@Transactional(readOnly=false)
	public void saveE(LoginForm lf) {
		loginFormDao.saveE(lf);
	}
	
}