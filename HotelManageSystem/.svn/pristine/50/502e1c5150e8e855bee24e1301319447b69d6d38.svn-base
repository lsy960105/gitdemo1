package com.company.action;

import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.company.dao.pojo.ClientType;
import com.company.dao.pojo.RoomType;
import com.company.service.iservice.ClientTypeService;
import com.opensymphony.xwork2.ModelDriven;

@Controller("clientTypection")
@Scope("prototype")
public class ClientTypeAction implements ModelDriven<ClientType>,RequestAware{

	@Autowired
	private ClientTypeService clientTypeService;
	private ClientType clientTypeModel = new ClientType();
	private Map<String,Object> requestMap;
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
	public ClientType getModel() {
		return clientTypeModel;
	}
	
	
	public String update(){
		return clientTypeService.update(clientTypeModel);
	}
	
	
	public String findById(){
		String msg = "error";
		ClientType clientType = clientTypeService.findById(clientTypeModel.getClientTypeId());
		if(clientType != null){
			requestMap.put("clientType", clientType);
			msg = "success";
		}
		return msg;
	}
	

}
