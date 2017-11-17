package com.company.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.company.dao.idao.HotelInfoDao;
import com.company.dao.pojo.HotelInfo;
import com.company.service.iservice.HotelInfoService;

@Service("hotelInfoService")
public class HotelInfoServiceImpl implements HotelInfoService {
	
	@Autowired
	private HotelInfoDao hotelInfoDao;
	
	@Transactional
	@Override
	public String save(HotelInfo t) {
		String msg = "error";
		try {
			hotelInfoDao.save(t);
			msg = "success";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return msg;
	}

	
	@Transactional
	@Override
	public String update(HotelInfo t) {
		String msg = "error";
		try {
			hotelInfoDao.update(t);
			msg = "success";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return msg;
	}

	
	@Transactional
	@Override
	public String delete(HotelInfo t) {
		String msg = "error";
		try {
			hotelInfoDao.delete(t);
			msg = "success";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return msg;
	}

	
	@Transactional
	@Override
	public HotelInfo findById(Integer k) {
		HotelInfo hotelInfo = null;
		try {
			hotelInfo = hotelInfoDao.findById(k);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return hotelInfo;
	}

	
	@Transactional
	@Override
	public List<HotelInfo> findByPage(int pageNo, int pageSize) {
		List<HotelInfo> hotelInfo = new ArrayList<>();
		try {
			hotelInfo = hotelInfoDao.findByPage(pageNo, pageSize);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return hotelInfo;
	}

}
