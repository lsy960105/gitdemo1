package com.company.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.company.dao.idao.OrderItemsDao;
import com.company.dao.pojo.Client;
import com.company.dao.pojo.OrderItems;

@Repository("orderItemsDao")
public class OrderItemsDaoImpl implements OrderItemsDao {

	@Autowired
	@Qualifier("sessionFactory")
	private SessionFactory sessionFactory;
	
	@Override
	public void save(OrderItems t) throws Exception {
		sessionFactory.getCurrentSession().save(t);

	}

	@Override
	public void delete(OrderItems t) throws Exception {
		sessionFactory.getCurrentSession().delete(t);

	}

	@Override
	public void update(OrderItems t) throws Exception {
		sessionFactory.getCurrentSession().update(t);

	}

	@Override
	public OrderItems findById(Integer k) throws Exception {
		return (OrderItems) sessionFactory.getCurrentSession().get(OrderItems.class, k);

	}

	@Override
	public List<OrderItems> findByPage(int pageNo, int pageSize) throws Exception {
		return sessionFactory.getCurrentSession()
				.createQuery("from OrderItems")
				.setFirstResult(pageSize * (pageNo - 1))
				.setMaxResults(pageSize)
				.list();
	}

}
