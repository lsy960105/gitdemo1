package com.company.dao.impl;

import java.util.Date;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.company.dao.idao.RoomInfoDao;
import com.company.dao.pojo.RoomInfo;

@Repository("roomInfoDao")
public class RoomInfoDaoImpl implements RoomInfoDao {
	
	@Autowired
	@Qualifier("sessionFactory")
	private SessionFactory sessionFactory;

	@Override
	public void save(RoomInfo t) throws Exception {
		sessionFactory.openSession().save(t);
	}

	@Override
	public void delete(RoomInfo t) throws Exception {
		sessionFactory.openSession().delete(t);
	}

	@Override
	public void update(RoomInfo t) throws Exception {
		sessionFactory.openSession().update(t);
	}

	@Override
	public RoomInfo findById(Integer k) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<RoomInfo> findByPage(int pageNo, int pageSize) throws Exception {
		return sessionFactory.openSession()
				.createQuery("from RoomInfo")
				.setFirstResult(pageSize * (pageNo - 1))
				.setMaxResults(pageSize)
				.list();
	}

	@Override
	public RoomInfo findByCondition(Date orderdate, int roomTypeId) throws Exception {
		return (RoomInfo) sessionFactory.openSession()
				.createQuery("from RoomInfo r where r.roominfodate=? and r.roomtypeid=?")
				.setParameter(0, orderdate)
				.setParameter(1, roomTypeId)
				.uniqueResult();
	}

}
