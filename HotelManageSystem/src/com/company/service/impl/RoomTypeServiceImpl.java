package com.company.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.company.dao.idao.RoomTypeDao;
import com.company.dao.pojo.RoomType;
import com.company.service.iservice.RoomTypeService;

@Service("roomTypeService")
public class RoomTypeServiceImpl implements RoomTypeService {
	
	@Autowired
	private RoomTypeDao roomTypeDao;

	@Transactional
	@Override
	public String save(RoomType t) {
		String msg = "error";
		try {
			roomTypeDao.save(t);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return msg;
	}

	
	@Transactional
	@Override
	public String update(RoomType t) {
		String msg = "error";
		try {
			roomTypeDao.update(t);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return msg;
	}

	
	@Transactional
	@Override
	public String delete(RoomType t) {
		String msg = "error";
		try {
			roomTypeDao.delete(t);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return msg;
	}

	
	@Transactional
	@Override
	public RoomType findById(Integer k) {
		RoomType roomType = null;
		try {
			roomType = roomTypeDao.findById(k);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return roomType;
	}

	
	@Transactional
	@Override
	public List<RoomType> findByPage(int pageNo, int pageSize) {
		List<RoomType> roomType = new ArrayList<>();
		try {
			roomType = roomTypeDao.findByPage(pageNo, pageSize);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return roomType;
	}

	
	

}
