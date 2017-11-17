package com.company.action;

import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.company.dao.pojo.RoomType;
import com.company.service.iservice.RoomTypeService;
import com.opensymphony.xwork2.ModelDriven;

@Controller("roomTypeAction")
@Scope("prototype")
public class RoomTypeAction implements RequestAware,ModelDriven<RoomType>{
	
	
	@Autowired
	private Map<String,Object> requestMap;
	private RoomType roomTypeModel = new RoomType();
	private RoomTypeService roomTypeService;
	
	
	@Override
	public RoomType getModel() {
		return roomTypeModel;
	}
	
	
	
	@Override
	public void setRequest(Map<String, Object> arg0) {
		requestMap = arg0;
	}
	
	
	public String roomTypeFindById(){
		String msg = "error";
		RoomType roomType = roomTypeService.findById(roomTypeModel.getRoomTypeId());
		if(roomType != null){
			requestMap.put("roomType", roomType);
			msg = "success";
		}
		return msg;
	}


	
	
	

}
