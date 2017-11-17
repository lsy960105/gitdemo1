package com.company.dao.pojo;

import java.util.Date;

/**
 * @author Administrator
 *
 */
public class RoomType {
	
	private int roomTypeId;
	private String roomTypeName;
	private Double Price;
	private int amount;
	private Date createTime;
	private Date updateTime;
	
	public RoomType() {
		// TODO Auto-generated constructor stub
	}

	public RoomType(int roomTypeId, String roomTypeName, Double price, int amount, Date createTime, Date updateTime) {
		super();
		this.roomTypeId = roomTypeId;
		this.roomTypeName = roomTypeName;
		Price = price;
		this.amount = amount;
		this.createTime = createTime;
		this.updateTime = updateTime;
	}

	public RoomType(String roomTypeName, Double price, int amount, Date createTime, Date updateTime) {
		super();
		this.roomTypeName = roomTypeName;
		Price = price;
		this.amount = amount;
		this.createTime = createTime;
		this.updateTime = updateTime;
	}

	public int getRoomTypeId() {
		return roomTypeId;
	}

	public void setRoomTypeId(int roomTypeId) {
		this.roomTypeId = roomTypeId;
	}

	public String getRoomTypeName() {
		return roomTypeName;
	}

	public void setRoomTypeName(String roomTypeName) {
		this.roomTypeName = roomTypeName;
	}

	public Double getPrice() {
		return Price;
	}

	public void setPrice(Double price) {
		Price = price;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
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
		return "RoomType [roomTypeId=" + roomTypeId + ", roomTypeName=" + roomTypeName + ", Price=" + Price
				+ ", amount=" + amount + ", createTime=" + createTime + ", updateTime=" + updateTime + "]";
	}
	
	
	

}
