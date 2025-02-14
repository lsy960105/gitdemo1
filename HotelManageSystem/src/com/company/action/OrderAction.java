package com.company.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.RequestAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.company.dao.pojo.Order;
import com.company.service.iservice.OrderService;
import com.opensymphony.xwork2.ModelDriven;

@Controller("orderAction")
@Scope("prototype")
public class OrderAction implements ModelDriven<Order>, RequestAware {

	@Autowired
	private OrderService OrderService;

	private Order OrderModel = new Order();

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
	public Order getModel() {
		return OrderModel;
	}

	private Map<String, Object> requestMap;

	@Override
	public void setRequest(Map<String, Object> arg0) {
		requestMap = arg0;
	}

	public String save() {
		return OrderService.save(OrderModel);
	}

	public String delete() {
		return OrderService.delete(OrderModel);
	}

	public String update() {
		return OrderService.update(OrderModel);
	}

	public String findByPage() {
		String msg = "error";
		if (pageNo < 1) {
			pageNo = 1;
		}
		List<Order> OrderList = OrderService.findByPage(pageNo, 5);
		if (OrderList != null && OrderList.size() > 0) {
			requestMap.put("OrderListFromServer", OrderList);
			msg = "success";
		}
		return msg;
	}

	public String findById() {
		String msg = "error";
		Order Order = OrderService.findById(OrderModel.getOrderId());
		if (Order != null) {

			if ("update".equals(type)) {
				ServletActionContext.getRequest().setAttribute("Order", Order);
				return "updateFromFindById";
			} else {
				List<Order> OrderList = new ArrayList<Order>();
				OrderList.add(Order);
				// ServletActionContext.getRequest().setAttribute("OrderListFromServer",
				// OrderList);
				requestMap.put("OrderListFromServer", OrderList);
				msg = "success";
			}
		}
		return msg;
	}

	
}
