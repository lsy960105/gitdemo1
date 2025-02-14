package com.company.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.company.dao.idao.ClientDao;
import com.company.dao.pojo.Client;
import com.company.service.iservice.ClientService;

@Service("clientService")
public class ClientServiceImpl implements ClientService {

	@Autowired
	private ClientDao clientDao;
	
	@Transactional
	@Override
	public String save(Client t) {
		String msg = "error";
		try {
			clientDao.save(t);
			msg = "success";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return msg;
	}

	@Transactional
	@Override
	public String update(Client t) {
		String msg = "error";
		try {
			clientDao.update(t);
			msg = "success";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return msg;
	}

	@Transactional
	@Override
	public String delete(Client t) {
		String msg = "error";
		try {
			clientDao.delete(t);
			msg = "success";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return msg;
	}

	@Transactional(readOnly=true)
	@Override
	public List<Client> findByPage(int pageNo, int pageSize) {
		List<Client> clientList = new ArrayList<Client>();
		try {
			clientList = clientDao.findByPage(pageNo, pageSize);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return clientList;
	}

	@Transactional(readOnly=true)
	@Override
	public Client findById(Integer k) {
		Client client = null;
		try {
			client = clientDao.findById(k);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return client;
	}

	@Transactional(readOnly=true)
	@Override
	public List<Client> findByName(String name) {
		List<Client> clientList = new ArrayList<Client>();
		try {
			clientList = clientDao.findByName(name);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return clientList;
	}


}
