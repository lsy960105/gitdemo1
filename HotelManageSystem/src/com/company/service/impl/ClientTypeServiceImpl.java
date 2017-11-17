package com.company.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.company.dao.idao.ClientTypeDao;
import com.company.dao.pojo.ClientType;
import com.company.service.iservice.ClientTypeService;

@Service("clientTypeService")
public class ClientTypeServiceImpl implements ClientTypeService {

	@Autowired
	private ClientTypeDao clientTypeDao;
	
	@Transactional
	@Override
	public String save(ClientType t) {
		String msg = "error";
		try {
			clientTypeDao.save(t);
			msg = "success";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return msg;
	}

	@Transactional
	@Override
	public String update(ClientType t) {
		String msg = "error";
		try {
			clientTypeDao.update(t);
			msg = "success";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return msg;
	}

	@Transactional
	@Override
	public String delete(ClientType t) {
		String msg = "error";
		try {
			clientTypeDao.delete(t);
			msg = "success";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return msg;
	}

	@Transactional(readOnly=true)
	@Override
	public ClientType findById(Integer k) {
		ClientType clientType = null;
		try {
			clientType = clientTypeDao.findById(k);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return clientType;
	}

	@Transactional(readOnly=true)
	@Override
	public List<ClientType> findByPage(int pageNo, int pageSize) {
		List<ClientType> clientTypeList = new ArrayList<ClientType>();
		try {
			clientTypeList = clientTypeDao.findByPage(pageNo, pageSize);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return clientTypeList;
	}

}
