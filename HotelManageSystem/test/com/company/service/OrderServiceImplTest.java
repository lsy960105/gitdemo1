package com.company.service;

import static org.junit.Assert.fail;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.company.dao.pojo.Client;
import com.company.dao.pojo.Order;
import com.company.service.iservice.ClientService;
import com.company.service.iservice.OrderService;

public class OrderServiceImplTest {
	
	ApplicationContext atc;
	OrderService orderService;
	ClientService clientService;

	@Before
	public void setUp() throws Exception {
		atc = new ClassPathXmlApplicationContext("applicationContext.xml");
		orderService = (OrderService) atc.getBean("orderService");
		clientService = (ClientService) atc.getBean("clientService");
	}

	@After
	public void tearDown() throws Exception {
		atc = null;
	}

	@Test
	public void testSave() {
		try {
			for(int i = 46; i<=50;i++){
			Client client = clientService.findById(i);
			Order order = new Order(client, new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2015-12-31 12:30:36"), "order", new Date());
			orderService.save(order);}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void testUpdate() {
		fail("Not yet implemented");
	}

	@Test
	public void testDelete() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindById() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindByPage() {
		fail("Not yet implemented");
	}

}
