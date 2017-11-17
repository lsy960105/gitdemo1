package com.company.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.company.dao.idao.OrderDao;
import com.company.dao.pojo.Client;
import com.company.dao.pojo.Order;

@Repository("orderDao")
public class OrderDaoImpl implements OrderDao {

	@Autowired
	@Qualifier("sessionFactory")
	private SessionFactory sessionFactory;
	
	@Override
	public void save(Order t) throws Exception {
		sessionFactory.getCurrentSession().save(t);

	}

	@Override
	public void delete(Order t) throws Exception {
		sessionFactory.getCurrentSession().delete(t);

	}

	@Override
	public void update(Order t) throws Exception {
		sessionFactory.getCurrentSession().update(t);

	}

	@Override
	public Order findById(Integer k) throws Exception {
		return (Order) sessionFactory.getCurrentSession().get(Order.class, k);
	}

	@Override
	public List<Order> findByPage(int pageNo, int pageSize) throws Exception {
		return sessionFactory.getCurrentSession()
				.createQuery("from Order")
				.setFirstResult(pageSize * (pageNo - 1))
				.setMaxResults(pageSize)
				.list();
	}

}
