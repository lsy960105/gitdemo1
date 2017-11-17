package com.company.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.company.dao.idao.RoomInfoDao;
import com.company.dao.pojo.RoomInfo;
import com.company.service.iservice.RoomInfoService;

@Service("roomInfoService")
public class RoomInfoServiceImpl implements RoomInfoService {
	
	
	@Autowired
	private RoomInfoDao roomInfoDao;

	
	@Transactional
	@Override
	public String save(RoomInfo t) {
		String msg = "error";
		try {
			roomInfoDao.save(t);
			msg = "success";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return msg;
	}

	
	@Transactional
	@Override
	public String update(RoomInfo t) {
		String msg = "error";
		try {
			roomInfoDao.update(t);
			msg = "success";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return msg;
	}

	
	@Transactional
	@Override
	public String delete(RoomInfo t) {
		String msg = "error";
		try {
			roomInfoDao.delete(t);
			msg = "success";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return msg;
	}

	
	@Transactional
	@Override
	public RoomInfo findById(Integer k) {
		RoomInfo roomInfo = null;
		try {
			roomInfo = roomInfoDao.findById(k);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return roomInfo;
	}

	
	@Transactional
	@Override
	public List<RoomInfo> findByPage(int pageNo, int pageSize) {
		List<RoomInfo> roomInfos = new ArrayList<>();
		try {
			roomInfos = roomInfoDao.findByPage(pageNo, pageSize);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return roomInfos;
	}

	
	@Transactional
	@Override
	public RoomInfo findByCondition(Date orderdate, int roomTypeId) {
		RoomInfo roomInfo = null;
		try {
			roomInfo = roomInfoDao.findByCondition(orderdate, roomTypeId);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return roomInfo;
	}

}
