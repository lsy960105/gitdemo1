package com.company.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.company.dao.pojo.Login;
import com.company.service.iservice.LoginService;
import com.opensymphony.xwork2.ModelDriven;

@Controller("loginAction")
@Scope("prototype")
public class LoginAction implements ModelDriven<Login>,SessionAware{

	@Autowired
	private LoginService loginService;
	
	private Login loginModel = new Login();
	
	private Map<String, Object> sessionMap;
	
	
	@Override
	public Login getModel() {
		return loginModel;
	}

	@Override
	public void setSession(Map<String, Object> arg0) {
		sessionMap = arg0;
	}
	
	
	
	public String login() {
		String msg = loginService.login(loginModel);
		System.out.println(loginModel);
		System.out.println(msg);
		if ("success".equals(msg)) {
			sessionMap.put("username",loginModel.getUsername());
		}
		return msg;
	}

	public String registry() {
		return loginService.registry(loginModel);
	}

}
