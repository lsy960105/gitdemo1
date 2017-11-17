package com.company.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.company.dao.pojo.HotelInfo;
import com.company.dao.pojo.Message;
import com.company.service.dto.result.InfosOfHM;
import com.company.service.iservice.HotelInfoService;
import com.company.service.iservice.MessageService;

@Controller("infosOfHMAction")
@Scope("prototype")
public class InfosOfHMAction implements RequestAware {

	@Autowired
	private HotelInfoService hotelInfoService;
	@Autowired
	private MessageService messageService;
	private Map<String, Object> requestMap;
	//private int pageNo;
	//private int pageSize = 5;
	
	

//	public int getPageNo() {
//		return pageNo;
//	}
//	
//
//	public void setPageNo(int pageNo) {
//		this.pageNo = pageNo;
//	}
//
//	public int getPageSize() {
//		return pageSize;
//	}
//
//	public void setPageSize(int pageSize) {
//		this.pageSize = pageSize;
//	}

	@Override
	public void setRequest(Map<String, Object> arg0) {
		requestMap = arg0;
	}

	public String infosOfHMFindAll() {
		String msg = "error";
		HotelInfo hotelInfo = hotelInfoService.findById(1);
		System.out.println(hotelInfo);
//		if (pageNo < 1) {
//			pageNo = 1;
//		}
		List<Message> messages = messageService.findByPage(1, 5);
		System.out.println(messages);
		if(hotelInfo != null && messages != null && messages.size() > 0){
			InfosOfHM infosOfHM = new InfosOfHM(hotelInfo, messages);
			requestMap.put("infosOfHM", infosOfHM);
			msg = "success";
		}
		return msg;
	}

}
