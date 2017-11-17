package com.company.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.company.dao.idao.EmpDao;
import com.company.dao.pojo.Emp;
import com.company.service.iservice.EmpService;

@Service("empService")
public class EmpServiceImpl implements EmpService {
	
	@Autowired
	private EmpDao empDao;

	@Transactional
	@Override
	public String save(Emp t) {
		String msg = "error";
		try {
			empDao.save(t);
			msg = "success";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return msg;
	}

	@Transactional
	@Override
	public String update(Emp t) {
		String msg = "error";
		try {
			empDao.update(t);
			msg = "success";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return msg;
	}

	@Transactional
	@Override
	public String delete(Emp t) {
		String msg = "error";
		try {
			empDao.delete(t);
			msg = "success";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return msg;
	}


	@Transactional
	@Override
	public Emp findById(Integer k) {
		Emp emp = null;
		try {
			emp = empDao.findById(k);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return emp;
	}

	
	@Transactional
	@Override
	public List<Emp> findByName(String ename,int pageNo,int pageSize) {
		List<Emp> emps = new ArrayList<>();
		try {
			emps = empDao.findByName(ename, pageNo, pageSize);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return emps;
	}

	
	@Transactional
	@Override
	public List<Emp> findByPage(int pageNo, int pageSize) {
		List<Emp> emps = new ArrayList<>();
		try {
			emps = empDao.findByPage(pageNo, pageSize);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return emps;
	}

}
