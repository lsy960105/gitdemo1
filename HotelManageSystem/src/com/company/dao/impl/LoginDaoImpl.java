package com.company.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.company.dao.idao.LoginDao;
import com.company.dao.pojo.Login;

@Repository("loginDao")
public class LoginDaoImpl implements LoginDao {
	
	@Autowired
	@Qualifier("sessionFactory")
	private SessionFactory sessionFactory;
	
	@Override
	public void save(Login t) {
		sessionFactory.openSession().save(t);
	}

	@Override
	public void update(Login t) {
		sessionFactory.openSession().update(t);
	}

	@Override
	public void delete(Login t) throws Exception {
		sessionFactory.openSession().delete(t);
	}


	@Override
	public Login findById(Integer k) throws Exception {
		return (Login) sessionFactory.openSession().get(Login.class, k);
	}

	@Override
	public String login(Login login) throws Exception {
		Session session = sessionFactory.openSession();
		Object obj = session.createQuery("from Login log where log.username=? and log.password=?")
				.setParameter(0, login.getUsername())
				.setParameter(1, login.getPassword())
				.uniqueResult();
		return obj == null ? "error" : "success";
	}

	@Override
	public void registry(Login login) throws Exception {
		Session session = sessionFactory.openSession();
		session.save(login);
	}

	@Override
	public List<Login> findByPage(int pageNo, int pageSize) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
