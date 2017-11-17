package com.company.service;

import static org.junit.Assert.fail;

import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.company.dao.pojo.RoomType;
import com.company.service.iservice.RoomTypeService;

public class RoomTypeServiceImplTest {
	
	ApplicationContext atc;
	RoomTypeService roomTypeService;

	@Before
	public void setUp() throws Exception {
		atc = new ClassPathXmlApplicationContext("applicationContext.xml");
		roomTypeService = (RoomTypeService) atc.getBean("roomTypeService");
	}

	@After
	public void tearDown() throws Exception {
		atc = null;
	}

	@Test
	public void testSave() {
		RoomType roomType = new RoomType("套房", 888.0, 5, new Date(), new Date());
		roomTypeService.save(roomType);
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
