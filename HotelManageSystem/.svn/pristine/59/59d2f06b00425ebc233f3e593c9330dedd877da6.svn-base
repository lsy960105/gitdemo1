package com.company.service;

import static org.junit.Assert.fail;

import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.company.dao.pojo.Login;
import com.company.service.iservice.LoginService;

public class LoginServiceImplTest {
	
	ApplicationContext atc;
	LoginService loginService;

	@Before
	public void setUp() throws Exception {
		atc = new ClassPathXmlApplicationContext("applicationContext.xml");
		loginService = (LoginService) atc.getBean("loginService");
	}

	@After
	public void tearDown() throws Exception {
		atc = null;
	}

	@Test
	public void testLogin() {
		Login login = new Login();
		login.setUsername("root");
		login.setPassword("123");
		String msg = loginService.login(login);
		System.out.println(msg);
	}

	@Test
	public void testRegistry() {
		Login login = new Login("root", "root", new Date(), new Date());
		loginService.registry(login);
	}

}
