package com.company.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.company.dao.pojo.ClientType;
import com.company.service.iservice.ClientTypeService;

public class ClientTypeServiceImplTest {

	ApplicationContext ctx;
	ClientTypeService clientTypeService;
	
	@Before
	public void setUp() throws Exception {
		ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		clientTypeService = (ClientTypeService) ctx.getBean("clientTypeService");
	}

	@After
	public void tearDown() throws Exception {
		ctx = null;
	}

	@Test
	public void testSave() {
		ClientType clientType = new ClientType("团体", 0.8 ,new Date(), new Date());
		String msg = clientTypeService.save(clientType);
		System.out.println(msg);
	}

	@Test
	public void testUpdate() {
		ClientType clientType = clientTypeService.findById(1);
		System.out.println("origin:" + clientType);
		clientType.setClientTypeName("bb");
		clientType.setClientTypeDiscount(22.2);
		String msg = clientTypeService.update(clientType);
		System.out.println(msg);
		testFindByPage();
	}

	@Test
	public void testDelete() {
		ClientType clientType = clientTypeService.findById(1);
		if (clientType != null) {
			String msg = clientTypeService.delete(clientType);
			System.out.println(msg);
		}
	}

	@Test
	public void testFindByPage() {
		List<ClientType> clientTypes = new ArrayList<>();
		clientTypes = clientTypeService.findByPage(0, 5);
		for (ClientType clientType : clientTypes)
			System.out.println(clientType);
	}

	@Test
	public void testFindById() {
		ClientType clientType = clientTypeService.findById(1);
		System.out.println(clientType);
	}

}
