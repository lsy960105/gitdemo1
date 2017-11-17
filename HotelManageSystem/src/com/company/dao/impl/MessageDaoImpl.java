package com.company.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.company.dao.idao.MessageDao;
import com.company.dao.pojo.Client;
import com.company.dao.pojo.Message;

@Repository("messageDao")
public class MessageDaoImpl implements MessageDao {

	@Autowired
	@Qualifier("sessionFactory")
	private SessionFactory sessionFactory;
	
	@Override
	public void save(Message t) throws Exception {
		sessionFactory.openSession().save(t);

	}

	@Override
	public void delete(Message t) throws Exception {
		sessionFactory.openSession().delete(t);

	}

	@Override
	public void update(Message t) throws Exception {
		sessionFactory.openSession().update(t);

	}

	@Override
	public Message findById(Integer k) throws Exception {
		return (Message) sessionFactory.openSession().get(Message.class, k);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Message> findByPage(int pageNo, int pageSize) throws Exception {
		return sessionFactory.openSession()
				.createQuery("from Message")
				.setFirstResult(pageSize * (pageNo - 1))
				.setMaxResults(pageSize)
				.list();
	}

}
