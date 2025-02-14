package com.company.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.company.dao.idao.EmpDao;
import com.company.dao.pojo.Emp;

@Repository("empDao")
public class EmpDaoImpl implements EmpDao {

	@Autowired
	@Qualifier("sessionFactory")
	private SessionFactory sessionFactory;
	

	@Override
	public void save(Emp t) {
		sessionFactory.openSession().save(t);
	}

	@Override
	public void update(Emp t) {
		sessionFactory.openSession().update(t);;
	}

	@Override
	public void delete(Emp t) {
		sessionFactory.openSession().delete(t);
	}


	@Override
	public Emp findById(Integer k) {
		return (Emp) sessionFactory.openSession().get(Emp.class, k);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Emp> findByName(String ename,int pageNo,int pageSize) throws Exception {
		return sessionFactory.openSession()
				.createQuery("from Emp where ename like :ename")
				.setParameter("ename", "%" + ename + "%")
				.setFirstResult(pageNo)
				.setMaxResults(pageSize)
				.list();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Emp> findByPage(int pageNo, int pageSize) throws Exception {
		return sessionFactory.openSession()
				.createQuery("from Emp")
				.setFirstResult(pageSize * (pageNo - 1))
				.setMaxResults(pageSize)
				.list();
	}


	
}
