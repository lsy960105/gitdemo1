package com.company.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.company.dao.idao.ReportDao;
import com.company.service.dto.result.ReportByClientType;
import com.company.service.dto.result.ReportByGender;
import com.company.service.iservice.ReportService;
import com.google.gson.Gson;

@Service("reportService")
public class ReportServiceImpl implements ReportService {

	@Autowired
	private ReportDao reportDao;
	
	@Transactional(readOnly=true)
	@Override
	public String reportByGender() {
		List<ReportByGender> reportByGenderList = new ArrayList<>();
		String reportByGenderStr = "";
		try {
			reportByGenderList = reportDao.reportByGender();
			Gson gson = new Gson();
			reportByGenderStr = gson.toJson(reportByGenderList);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return reportByGenderStr;
	}

	@Override
	public String reportClientType() {
		List<ReportByClientType> reportByClientTypeList = new ArrayList<ReportByClientType>();
		String reportClientStr = "";
		try {
			reportByClientTypeList = reportDao.reportClientType();
			Gson gson = new Gson();
			reportClientStr = gson.toJson(reportByClientTypeList);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return reportClientStr;
	}

}
