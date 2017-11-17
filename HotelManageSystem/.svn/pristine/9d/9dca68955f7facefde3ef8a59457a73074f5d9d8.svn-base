package com.company.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.company.dao.idao.OrderItemsDao;
import com.company.dao.pojo.OrderItems;
import com.company.service.iservice.OrderItemsService;

@Service("orderItemsService")
public class OrderItemsServiceImpl implements OrderItemsService {

	@Autowired
	private OrderItemsDao orderItemsDao;
	
	@Transactional
	@Override
	public String save(OrderItems t) {
		String msg = "error";
		try {
			orderItemsDao.save(t);
			msg = "success";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return msg;
	}

	@Transactional
	@Override
	public String update(OrderItems t) {
		String msg = "error";
		try {
			orderItemsDao.update(t);
			msg = "success";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return msg;
	}

	@Transactional
	@Override
	public String delete(OrderItems t) {
		String msg = "error";
		try {
			orderItemsDao.delete(t);
			msg = "success";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return msg;
	}

	@Transactional(readOnly=true)
	@Override
	public OrderItems findById(Integer k) {
		OrderItems OrderItems = null;
		try {
			OrderItems = orderItemsDao.findById(k);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return OrderItems;
	}

	@Transactional(readOnly=true)
	@Override
	public List<OrderItems> findByPage(int pageNo, int pageSize) {
		List<OrderItems> OrderItemsList = new ArrayList<OrderItems>();
		try {
			OrderItemsList = orderItemsDao.findByPage(pageNo, pageSize);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return OrderItemsList;
	}

}
