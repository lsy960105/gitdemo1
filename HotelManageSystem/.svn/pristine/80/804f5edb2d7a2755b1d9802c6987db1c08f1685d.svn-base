package com.company.service;

import static org.junit.Assert.fail;

import java.util.Date;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.company.dao.pojo.RoomInfo;
import com.company.dao.pojo.RoomType;
import com.company.service.iservice.RoomInfoService;
import com.company.service.iservice.RoomTypeService;

public class RoomInfoServiceImplTest {
	
	ApplicationContext atc;
	RoomInfoService roomInfoService;
	RoomTypeService roomTypeService;

	@Before
	public void setUp() throws Exception {
		atc = new ClassPathXmlApplicationContext("applicationContext.xml");
		roomInfoService = (RoomInfoService) atc.getBean("roomInfoService");
		roomTypeService = (RoomTypeService) atc.getBean("roomTypeService");
	}

	@After
	public void tearDown() throws Exception {
		atc = null;
	}

	@Test
	public void testSave() {
		for(int i = 1;i <= 7;i++){
			for(int j = 1; j <= 5;j++){
				RoomType roomType = roomTypeService.findById(j);
				RoomInfo roomInfo = new RoomInfo(new Date(System.currentTimeMillis() + 24*60*60*1000*i), roomType, roomType.getAmount(), new Date(), new Date());				
				roomInfoService.save(roomInfo);
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
		List<RoomInfo> list = roomInfoService.findByPage(1, 5);
		for(RoomInfo r : list){
			System.out.println(r);
		}
	}

	@Test
	public void testFindByCondition() {
		fail("Not yet implemented");
	}

}
