package com.company.service;

import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.company.service.dto.result.ReportByClientType;
import com.company.service.iservice.ReportService;

public class ReportServiceImplTest {

	ApplicationContext ctx;
	ReportService reportService;
	@Before
	public void setUp() throws Exception {
		ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		reportService = (ReportService) ctx.getBean("reportService");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testReportByGender() {
		String str = reportService.reportByGender();
		System.out.println(str);
	}

	@Test
	public void testReportClientType() {
		
		String clients = reportService.reportClientType();
		
			System.out.println(clients);
	}

}
