package com.company.dao.pojo;

import java.util.Date;

public class RoomInfo {
	
	private int roomInfoId;
	private Date roomInfoDate;
	private RoomType roomType;
	private int amount;
	private Date createTime;
	private Date updateTime;
	
	public RoomInfo() {
		// TODO Auto-generated constructor stub
	}

	public RoomInfo(int roomInfoId, Date roomInfoDate, RoomType roomType, int amount, Date createTime,
			Date updateTime) {
		super();
		this.roomInfoId = roomInfoId;
		this.roomInfoDate = roomInfoDate;
		this.roomType = roomType;
		this.amount = amount;
		this.createTime = createTime;
		this.updateTime = updateTime;
	}

	public RoomInfo(Date roomInfoDate, RoomType roomType, int amount, Date createTime, Date updateTime) {
		super();
		this.roomInfoDate = roomInfoDate;
		this.roomType = roomType;
		this.amount = amount;
		this.createTime = createTime;
		this.updateTime = updateTime;
	}

	public int getRoomInfoId() {
		return roomInfoId;
	}

	public void setRoomInfoId(int roomInfoId) {
		this.roomInfoId = roomInfoId;
	}

	public Date getRoomInfoDate() {
		return roomInfoDate;
	}

	public void setRoomInfoDate(Date roomInfoDate) {
		this.roomInfoDate = roomInfoDate;
	}

	public RoomType getRoomType() {
		return roomType;
	}

	public void setRoomType(RoomType roomType) {
		this.roomType = roomType;
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
		return "RoomInfo [roomInfoId=" + roomInfoId + ", roomInfoDate=" + roomInfoDate + ", roomType=" + roomType.getRoomTypeName()
				+ ", amount=" + amount + ", createTime=" + createTime + ", updateTime=" + updateTime + "]";
	}

	
	

}
