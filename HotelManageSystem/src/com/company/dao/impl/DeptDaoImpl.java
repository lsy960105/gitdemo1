package com.company.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.company.dao.idao.DeptDao;
import com.company.dao.pojo.Dept;

@Repository("DeptDao")
public class DeptDaoImpl implements DeptDao {

	@Autowired
	@Qualifier("sessionFactory")
	private SessionFactory sessionFactory;

	@Override
	public void save(Dept t) {
		sessionFactory.openSession().save(t);
	}

	@Override
	public void update(Dept t) {
		sessionFactory.openSession().update(t);
		;
	}

	@Override
	public void delete(Dept t) {
		sessionFactory.openSession().delete(t);
	}

	@Override
	public Dept findById(Integer k) {
		return (Dept) sessionFactory.openSession().get(Dept.class, k);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Dept> findByPage(int pageNo, int pageSize) throws Exception {
		return sessionFactory.openSession()
				.createQuery("from Dept")
				.setFirstResult(pageSize * (pageNo - 1))
				.setMaxResults(pageSize).list();
	}

}
