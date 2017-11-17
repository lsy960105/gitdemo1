package com.company.service.dto.result;

import com.company.dao.pojo.Client;
import com.company.dao.pojo.Order;
import com.company.dao.pojo.OrderItems;
import com.company.dao.pojo.RoomInfo;

public class HotelOrderFuntion {
	
	private Client client;
	private RoomInfo roomInfo;
	private Order order;
	private OrderItems orderItems;
	public HotelOrderFuntion(Client client, RoomInfo roomInfo, Order order, OrderItems orderItems) {
		super();
		this.client = client;
		this.roomInfo = roomInfo;
		this.order = order;
		this.orderItems = orderItems;
	}
	
	public HotelOrderFuntion() {
		// TODO Auto-generated constructor stub
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public RoomInfo getRoomInfo() {
		return roomInfo;
	}

	public void setRoomInfo(RoomInfo roomInfo) {
		this.roomInfo = roomInfo;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public OrderItems getOrderItems() {
		return orderItems;
	}

	public void setOrderItems(OrderItems orderItems) {
		this.orderItems = orderItems;
	}

	@Override
	public String toString() {
		return "HotelOrderFuntion [client=" + client.getClientId() + ", roomInfo=" + roomInfo.getRoomInfoId() + ", order=" + order.getOrderId() + ", orderItems="
				+ orderItems.getOrderItemsId() + "]";
	}
	
	

}
