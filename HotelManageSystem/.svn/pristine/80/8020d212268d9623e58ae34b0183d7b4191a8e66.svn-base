package com.company.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.company.dao.idao.MessageDao;
import com.company.dao.pojo.Message;
import com.company.service.iservice.MessageService;

@Service("messageService")
public class MessageServiceImpl implements MessageService {

	@Autowired
	private MessageDao messageDao;
	
	@Transactional
	@Override
	public String save(Message t) {
		String msg = "error";
		try {
			messageDao.save(t);
			msg = "success";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return msg;
	}

	@Transactional
	@Override
	public String update(Message t) {
		String msg = "error";
		try {
			messageDao.update(t);
			msg = "success";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return msg;
	}

	@Transactional
	@Override
	public String delete(Message t) {
		String msg = "error";
		try {
			messageDao.delete(t);
			msg = "success";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return msg;
	}

	@Transactional(readOnly=true)
	@Override
	public Message findById(Integer k) {
		Message message = null;
		try {
			message = messageDao.findById(k);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return message;
	}

	@Transactional(readOnly=true)
	@Override
	public List<Message> findByPage(int pageNo, int pageSize) {
		List<Message> messageList = new ArrayList<Message>();
		try {
			messageList = messageDao.findByPage(pageNo, pageSize);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return messageList;
	}

}
