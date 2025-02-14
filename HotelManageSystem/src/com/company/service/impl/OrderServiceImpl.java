package com.company.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.company.dao.idao.OrderDao;
import com.company.dao.pojo.Order;
import com.company.service.iservice.OrderService;

@Service("orderService")
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderDao orderDao;
	
	@Transactional
	@Override
	public String save(Order t) {
		String msg = "error";
		try {
			orderDao.save(t);
			msg = "success";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return msg;
	}

	@Transactional
	@Override
	public String update(Order t) {
		String msg = "error";
		try {
			orderDao.update(t);
			msg = "success";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return msg;
	}

	@Transactional
	@Override
	public String delete(Order t) {
		String msg = "error";
		try {
			orderDao.delete(t);
			msg = "success";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return msg;
	}

	@Transactional(readOnly=true)
	@Override
	public Order findById(Integer k) {
		Order order = null;
		try {
			order = orderDao.findById(k);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return order;
	}

	@Transactional(readOnly=true)
	@Override
	public List<Order> findByPage(int pageNo, int pageSize) {
		List<Order> orderList = new ArrayList<Order>();
		try {
			orderList = orderDao.findByPage(pageNo, pageSize);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return orderList;
	}

}
