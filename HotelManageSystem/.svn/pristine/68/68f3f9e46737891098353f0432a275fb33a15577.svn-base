package com.company.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.company.dao.pojo.RoomInfo;
import com.company.dao.pojo.RoomType;
import com.company.service.iservice.RoomInfoService;
import com.opensymphony.xwork2.ModelDriven;

@Controller("roomInfoAction")
@Scope("prototype")
public class RoomInfoAction implements ModelDriven<RoomInfo>, RequestAware {

	@Autowired
	private RoomInfoService roomInfoService;
	private RoomInfo roomInfoModel = new RoomInfo();
	private Map<String, Object> requestMap;
	private int pageNo;
	private int pageSize = 5;
	
	
	

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	@Override
	public void setRequest(Map<String, Object> arg0) {
		requestMap = arg0;
	}

	@Override
	public RoomInfo getModel() {
		return roomInfoModel;
	}

	public String save() {
		return roomInfoService.save(roomInfoModel);
	}

	public String delete() {
		return roomInfoService.delete(roomInfoModel);
	}

	public String update() {
		return roomInfoService.update(roomInfoModel);
	}
	
	public String findByCondition(){
		String msg = "error";
		RoomInfo roomInfo = roomInfoService.findByCondition(roomInfoModel.getRoomInfoDate(), roomInfoModel.getRoomType().getRoomTypeId());
		if(roomInfo != null){
			requestMap.put("roomInfo", roomInfo);
			msg = "success";
		}
		return msg;
	}
	
	public String findByPage(){
		String msg = "error";
		if(pageNo < 1){
			pageNo = 1;
		}
		List<RoomInfo> roomInfoList = roomInfoService.findByPage(pageNo, pageSize);
		if(roomInfoList != null && roomInfoList.size() > 0){
			requestMap.put("roomInfoList", roomInfoList);
			msg = "success";
		}
		return msg;
	}
}
