package com.company.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.company.dao.idao.HotelInfoDao;
import com.company.dao.pojo.HotelInfo;

@Repository("hotelInfoDao")
public class HotelInfoDaoImpl implements HotelInfoDao {

	@Autowired
	@Qualifier("sessionFactory")
	private SessionFactory sessionFactory;
	

	@Override
	public void save(HotelInfo t) {
		sessionFactory.openSession().save(t);
	}

	@Override
	public void update(HotelInfo t) {
		sessionFactory.openSession().update(t);;
	}

	@Override
	public void delete(HotelInfo t) {
		sessionFactory.openSession().delete(t);
	}


	@Override
	public HotelInfo findById(Integer k) {
		return (HotelInfo) sessionFactory.openSession().get(HotelInfo.class, k);
	}

	

	@SuppressWarnings("unchecked")
	@Override
	public List<HotelInfo> findByPage(int pageNo, int pageSize) throws Exception {
		return sessionFactory.openSession()
				.createQuery("from HotelInfo")
				.setFirstResult(pageSize * (pageNo - 1))
				.setMaxResults(pageSize)
				.list();
	}


	
}
