package com.company.dao.pojo;

import java.io.Serializable;
import java.util.Date;

public class OrderItems implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private int orderItemsId;
	private RoomType roomType;
	private int orderItemsCount;
	private double orderItemsPrice;
	private Date inTime;
	private Date outTime;
	private Order order;
	private Date createTime;
	private Date updateTime;
	public OrderItems() {
		// TODO Auto-generated constructor stub
	}
	public OrderItems(int orderItemsId, RoomType roomType, int orderItemsCount, double orderItemsPrice, Date inTime,
			Date outTime, Order order, Date createTime, Date updateTime) {
		super();
		this.orderItemsId = orderItemsId;
		this.roomType = roomType;
		this.orderItemsCount = orderItemsCount;
		this.orderItemsPrice = orderItemsPrice;
		this.inTime = inTime;
		this.outTime = outTime;
		this.order = order;
		this.createTime = createTime;
		this.updateTime = updateTime;
	}
	
	
	public OrderItems(RoomType roomType, int orderItemsCount, double orderItemsPrice, Date inTime, Date outTime,
			Order order, Date createTime, Date updateTime) {
		super();
		this.roomType = roomType;
		this.orderItemsCount = orderItemsCount;
		this.orderItemsPrice = orderItemsPrice;
		this.inTime = inTime;
		this.outTime = outTime;
		this.order = order;
		this.createTime = createTime;
		this.updateTime = updateTime;
	}
	public int getOrderItemsId() {
		return orderItemsId;
	}
	public void setOrderItemsId(int orderItemsId) {
		this.orderItemsId = orderItemsId;
	}
	public RoomType getRoomType() {
		return roomType;
	}
	public void setRoomType(RoomType roomType) {
		this.roomType = roomType;
	}
	public int getOrderItemsCount() {
		return orderItemsCount;
	}
	public void setOrderItemsCount(int orderItemsCount) {
		this.orderItemsCount = orderItemsCount;
	}
	public double getOrderItemsPrice() {
		return orderItemsPrice;
	}
	public void setOrderItemsPrice(double orderItemsPrice) {
		this.orderItemsPrice = orderItemsPrice;
	}
	public Date getInTime() {
		return inTime;
	}
	public void setInTime(Date inTime) {
		this.inTime = inTime;
	}
	public Date getOutTime() {
		return outTime;
	}
	public void setOutTime(Date outTime) {
		this.outTime = outTime;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	@Override
	public String toString() {
		return "OrderItems [orderTtemsId=" + orderItemsId + ", roomType=" + roomType + ", orderItemsCount="
				+ orderItemsCount + ", orderItemsPrice=" + orderItemsPrice + ", inTime=" + inTime + ", outTime="
				+ outTime + ", order=" + order + ", createTime=" + createTime + ", updateTime=" + updateTime + "]";
	}
	
	
}
