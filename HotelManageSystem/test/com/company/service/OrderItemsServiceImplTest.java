package com.company.service;

import static org.junit.Assert.fail;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.company.dao.pojo.Order;
import com.company.dao.pojo.OrderItems;
import com.company.dao.pojo.RoomType;
import com.company.service.iservice.OrderItemsService;
import com.company.service.iservice.OrderService;
import com.company.service.iservice.RoomTypeService;

public class OrderItemsServiceImplTest {
	
	ApplicationContext atc;
	OrderItemsService orderItemsService;
	OrderService orderService;
	RoomTypeService roomTypeService;

	@Before
	public void setUp() throws Exception {
		atc = new ClassPathXmlApplicationContext("applicationContext.xml");
		orderItemsService = (OrderItemsService) atc.getBean("orderItemsService");
		orderService = (OrderService) atc.getBean("orderService");
		roomTypeService = (RoomTypeService) atc.getBean("roomTypeService");
	}

	@After
	public void tearDown() throws Exception {
		atc = null;
	}

	@Test
	public void testSave() {
		for(int i=45;i<=49;i++){
		Random random = new Random();
		int b = random.nextInt(5) + 1;
		int a = random.nextInt(3) + 1;
		RoomType roomType = roomTypeService.findById(b);
		Order order = orderService.findById(i);
		try {
			OrderItems orderItems = new OrderItems(roomType, 1, roomType.getPrice(), new SimpleDateFormat("yyyy-MM-dd").parse("2017-11-0" + a), new SimpleDateFormat("yyyy-MM-dd").parse("2017-11-0" + a), order, new Date(), new Date());
			orderItemsService.save(orderItems);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
