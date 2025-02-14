package com.company.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.company.dao.idao.RoomTypeDao;
import com.company.dao.pojo.RoomType;

@Repository("roomTypeDao")
public class RoomTypeDaoImpl implements RoomTypeDao {
	
	@Autowired
	@Qualifier("sessionFactory")
	private SessionFactory sessionFactory;

	@Override
	public void save(RoomType t) {
		sessionFactory.openSession().save(t);
	}

	@Override
	public void update(RoomType t) {
		sessionFactory.openSession().update(t);;
	}

	@Override
	public void delete(RoomType t) {
		sessionFactory.openSession().delete(t);
	}


	@Override
	public RoomType findById(Integer k) {
		return (RoomType) sessionFactory.openSession().get(RoomType.class, k);
	}

	

	@SuppressWarnings("unchecked")
	@Override
	public List<RoomType> findByPage(int pageNo, int pageSize) throws Exception {
		return sessionFactory.openSession()
				.createQuery("from RoomType")
				.setFirstResult(pageSize * (pageNo - 1))
				.setMaxResults(pageSize)
				.list();
	}

}
