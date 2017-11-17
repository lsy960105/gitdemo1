package com.company.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.RequestAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.company.dao.pojo.OrderItems;
import com.company.service.iservice.OrderItemsService;
import com.opensymphony.xwork2.ModelDriven;

@Controller("orderItemsAction")
@Scope("prototype")
public class OrderItemsAction implements ModelDriven<OrderItems>, RequestAware {

	@Autowired
	private OrderItemsService OrderItemsService;

	private OrderItems OrderItemsModel = new OrderItems();

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
	public OrderItems getModel() {
		return OrderItemsModel;
	}

	private Map<String, Object> requestMap;

	@Override
	public void setRequest(Map<String, Object> arg0) {
		requestMap = arg0;
	}

	public String OrderItemsSave() {
		return OrderItemsService.save(OrderItemsModel);
	}

	public String OrderItemsDelete() {
		return OrderItemsService.delete(OrderItemsModel);
	}

	public String OrderItemsUpdate() {
		return OrderItemsService.update(OrderItemsModel);
	}

	public String OrderItemsFindByPage() {
		String msg = "error";
		if (pageNo < 1) {
			pageNo = 1;
		}
		List<OrderItems> OrderItemsList = OrderItemsService.findByPage(pageNo, pageSize);
		if (OrderItemsList != null && OrderItemsList.size() > 0) {
			requestMap.put("OrderItemsListFromServer", OrderItemsList);
		}
		return msg;
	}

	public String OrderItemsFindById() {
		String msg = "error";
		OrderItems OrderItems = OrderItemsService.findById(OrderItemsModel.getOrderItemsId());
		if (OrderItems != null) {

			if ("update".equals(type)) {
				ServletActionContext.getRequest().setAttribute("OrderItems", OrderItems);
				return "updateFromFindById";
			} else {
				List<OrderItems> OrderItemsList = new ArrayList<OrderItems>();
				OrderItemsList.add(OrderItems);
				// ServletActionContext.getRequest().setAttribute("OrderItemsListFromServer",
				// OrderItemsList);
				requestMap.put("OrderItemsListFromServer", OrderItemsList);
				msg = "success";
			}
		}
		return msg;
	}

	
}
