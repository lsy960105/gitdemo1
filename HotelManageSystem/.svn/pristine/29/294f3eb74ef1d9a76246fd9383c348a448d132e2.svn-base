package com.company.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.company.dao.idao.ClientTypeDao;
import com.company.dao.pojo.Client;
import com.company.dao.pojo.ClientType;

@Repository("clientTypeDao")
public class ClientTypeDaoImpl implements ClientTypeDao {

	@Autowired
	@Qualifier("sessionFactory")
	private SessionFactory sessionFactory;

	@Override
	public void save(ClientType t) throws Exception {
		sessionFactory.getCurrentSession().save(t);
		
	}

	@Override
	public void delete(ClientType t) throws Exception {
		sessionFactory.getCurrentSession().delete(t);
		
	}

	@Override
	public void update(ClientType t) throws Exception {
		sessionFactory.getCurrentSession().update(t);
		
	}

	@Override
	public ClientType findById(Integer k) throws Exception {
		return (ClientType) sessionFactory.getCurrentSession().get(ClientType.class, k);
	}

	@Override
	public List<ClientType> findByPage(int pageNo, int pageSize) throws Exception {
		return sessionFactory.getCurrentSession()
				.createQuery("from ClientType")
				.setFirstResult(pageSize * (pageNo - 1))
				.setMaxResults(pageSize)
				.list();
	}
	
}
