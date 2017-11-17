package com.company.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.company.dao.idao.ClientDao;
import com.company.dao.pojo.Client;

@Repository("clientDao")
public class ClientDaoImpl implements ClientDao {

	@Autowired
	@Qualifier("sessionFactory")
	private SessionFactory sessionFactory;
	
	@Override
	public void save(Client t) throws Exception {
		sessionFactory.getCurrentSession().save(t);
	}

	@Override
	public void delete(Client t) throws Exception {
		sessionFactory.getCurrentSession().delete(t);

	}

	@Override
	public void update(Client t) throws Exception {
		sessionFactory.getCurrentSession().update(t);

	}

	@Override
	public Client findById(Integer k) throws Exception {
		return (Client) sessionFactory.getCurrentSession().get(Client.class, k);
	}

	@Override
	public List<Client> findByName(String name) {
		return sessionFactory.getCurrentSession()
				.createQuery("from Client where cname like :name")
				.setParameter("name", "%" + name + "%")
				.list();
	}

	@Override
	public List<Client> findByPage(int pageNo, int pageSize) throws Exception {
		return sessionFactory.getCurrentSession()
				.createQuery("from Client")
				.setFirstResult(pageSize * (pageNo - 1))
				.setMaxResults(pageSize)
				.list();
	}

}
