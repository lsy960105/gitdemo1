package com.company.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.company.dao.pojo.Client;
import com.company.dao.pojo.ClientType;
import com.company.service.iservice.ClientService;
import com.company.service.iservice.ClientTypeService;

public class ClientServiceImplTest {

	ApplicationContext ctx;
	ClientService clientService;
	ClientTypeService clientTypeService;

	@Before
	public void setUp() throws Exception {
		ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		clientService = (ClientService) ctx.getBean("clientService");
		clientTypeService = (ClientTypeService) ctx.getBean("clientTypeService");
	}

	@After
	public void tearDown() throws Exception {
		ctx = null;
	}

	@Test
	public void testSave() {
		ClientType clientType = clientTypeService.findById(1);
		Client client = null;
		
				client = new Client(4, "hanghang", "23212212", new Date(), "m", clientType, null,new Date(), new Date());
				clientService.save(client);
	
	}

	@Test
	public void testUpdate() {
		try {
			Random random = new Random();
			for (int i = 7; i <= 50; i++) {
				Client client = clientService.findById(i);
				int a = random.nextInt(47) + 50;
				client.setBirthday(new SimpleDateFormat("yyyy-MM-dd").parse("19" + a + "-01-05"));
				String msg = clientService.update(client);
				System.out.println(msg);
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void testDelete() {
		Client client = clientService.findById(1);
		if (client != null) {
			String msg = clientService.delete(client);
			System.out.println(msg);
		}
	}

	@Test
	public void testFindByPage() {
		List<Client> clients = new ArrayList<>();
		clients = clientService.findByPage(0, 5);
		for (Client client : clients)
			System.out.println(client);
	}

	@Test
	public void testFindById() {
		Client client = clientService.findById(1);
		System.out.println(client);
	}

	@Test
	public void testFindByName() {
		List<Client> clients = new ArrayList<>();
		clients = clientService.findByName("a");
		for (Client client : clients) {
			System.out.println(client);
		}
	}

}
