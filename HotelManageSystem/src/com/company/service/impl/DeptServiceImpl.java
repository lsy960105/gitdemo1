package com.company.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.company.dao.idao.DeptDao;
import com.company.dao.pojo.Dept;
import com.company.service.iservice.DeptService;

@Service("deptService")
public class DeptServiceImpl implements DeptService {

	@Autowired
	private DeptDao DeptDao;

	@Transactional
	@Override
	public String save(Dept t) {
		String msg = "error";
		try {
			DeptDao.save(t);
			msg = "success";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return msg;
	}

	@Transactional
	@Override
	public String update(Dept t) {
		String msg = "error";
		try {
			DeptDao.update(t);
			msg = "success";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return msg;
	}

	@Transactional
	@Override
	public String delete(Dept t) {
		String msg = "error";
		try {
			DeptDao.delete(t);
			msg = "success";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return msg;
	}


	@Transactional
	@Override
	public Dept findById(Integer k) {
		Dept Dept = null;
		try {
			Dept = DeptDao.findById(k);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Dept;
	}

	

	
	@Transactional
	@Override
	public List<Dept> findByPage(int pageNo, int pageSize) {
		List<Dept> depts = new ArrayList<>();
		try {
			depts = DeptDao.findByPage(pageNo, pageSize);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return depts;
	}


}
