package com.company.service;

import static org.junit.Assert.fail;

import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.company.dao.pojo.Dept;
import com.company.service.iservice.DeptService;

public class DeptServiceImplTest {
	
	ApplicationContext atc;
	DeptService deptService;

	@Before
	public void setUp() throws Exception {
		atc = new ClassPathXmlApplicationContext("applicationContext.xml");
		deptService = (DeptService) atc.getBean("deptService");
	}

	@After
	public void tearDown() throws Exception {
		atc = null;
	}

	@Test
	public void testSave() {
		Dept dept = new Dept("leader", "1001", new Date(), new Date());
		deptService.save(dept);
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
