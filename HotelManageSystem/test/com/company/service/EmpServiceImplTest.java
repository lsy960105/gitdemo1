package com.company.service;

import static org.junit.Assert.fail;

import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.company.dao.pojo.Dept;
import com.company.dao.pojo.Emp;
import com.company.service.iservice.EmpService;

public class EmpServiceImplTest {

	ApplicationContext atc;
	EmpService empService;

	@Before
	public void setUp() throws Exception {
		atc = new ClassPathXmlApplicationContext("applicationContext.xml");
		empService = (EmpService) atc.getBean("empService");
	}

	@After
	public void tearDown() throws Exception {
		atc = null;
	}

	@Test
	public void testSave() {
		Dept dept = new Dept(1,"leader", "1001", new Date(), new Date());
		Emp emp = new Emp("lishiyan", "PM", 1, new Date(), 30000.0, 10000.0, dept, new Date(), new Date());
		empService.save(emp);
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
	public void testFindByName() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindByPage() {
		fail("Not yet implemented");
	}

}
