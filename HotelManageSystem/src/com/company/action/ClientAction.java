package com.company.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.RequestAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.company.dao.pojo.Client;
import com.company.service.iservice.ClientService;
import com.opensymphony.xwork2.ModelDriven;

@Controller("clientAction")
@Scope("prototype")
public class ClientAction implements ModelDriven<Client>, RequestAware {

	@Autowired
	private ClientService clientService;

	private Client clientModel = new Client();

	private int pageNo;
	private int pageSize = 5;
	private String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

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
	public Client getModel() {
		return clientModel;
	}

	private Map<String, Object> requestMap;

	@Override
	public void setRequest(Map<String, Object> arg0) {
		requestMap = arg0;
	}

	public String save() {
		return clientService.save(clientModel);
	}

	public String delete() {
		return clientService.delete(clientModel);
	}

	public String update() {
		return clientService.update(clientModel);
	}

	public String findByPage() {
		String msg = "error";
		if (pageNo < 1) {
			pageNo = 1;
		}
		List<Client> ClientList = clientService.findByPage(pageNo, 5);
		if (ClientList != null && ClientList.size() > 0) {
			requestMap.put("ClientListFromServer", ClientList);
			requestMap.put("pageNo", pageNo);
			msg = "success";
		}
		return msg;
	}

	public String findById() {
		String msg = "error";
		Client Client = clientService.findById(clientModel.getClientId());
		if (Client != null) {

			if ("update".equals(type)) {
				ServletActionContext.getRequest().setAttribute("Client", Client);
				return "updateFromFindById";
			} else {
				List<Client> ClientList = new ArrayList<Client>();
				ClientList.add(Client);
				 ServletActionContext.getRequest().setAttribute("ClientListFromServer",
				 ClientList);
				requestMap.put("ClientListFromServer", ClientList);
				msg = "success";
			}
		}
		return msg;
	}

	public String findByName() {
		String msg = "error";
		List<Client> ClientList = clientService.findByName(clientModel.getCname());
		if (ClientList != null && ClientList.size() > 0) {
			// ServletActionContext.getRequest().setAttribute("ClientListFromServer",
			// ClientList);
			requestMap.put("ClientListFromServer", ClientList);
			msg = "success";
		}
		return msg;
	}
}
