package com.company.dao.pojo;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

public class Order implements Serializable{
	private static final long serialVersionUID = 1L;
	private int orderId;
	private Client client;
	private Set<OrderItems> orderItems;
	private Date orderDate;
	private String orderState;
	private Date updateTime;
	
	public Order() {
		// TODO Auto-generated constructor stub
	}

	public Order(int orderId, Client client, Set<OrderItems> orderItems, Date orderDate, String orderState,
			Date updateTime) {
		super();
		this.orderId = orderId;
		this.client = client;
		this.orderItems = orderItems;
		this.orderDate = orderDate;
		this.orderState = orderState;
		this.updateTime = updateTime;
	}

	public Order(Client client, Set<OrderItems> orderItems, Date orderDate, String orderState, Date updateTime) {
		super();
		this.client = client;
		this.orderItems = orderItems;
		this.orderDate = orderDate;
		this.orderState = orderState;
		this.updateTime = updateTime;
	}
	
	
	

	public Order(Client client, Date orderDate, String orderState, Date updateTime) {
		super();
		this.client = client;
		this.orderDate = orderDate;
		this.orderState = orderState;
		this.updateTime = updateTime;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Set<OrderItems> getOrderItems() {
		return orderItems;
	}

	public void setOrderItems(Set<OrderItems> orderItems) {
		this.orderItems = orderItems;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public String getOrderState() {
		return orderState;
	}

	public void setOrderState(String orderState) {
		this.orderState = orderState;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", client=" + client.getCname() + ", orderItems=" + orderItems.size() + ", orderDate="
				+ orderDate + ", orderState=" + orderState + ", updateTime=" + updateTime + "]";
	}

	
	
}
