package com.company.dao.pojo;

import java.util.Date;

public class HotelInfo {
	
	private int hotelInfoId;
	private String hotelName;
	private String hotelLocation;
	private int hotelLevel;
	private String hotelIntroduction;
	private Date createTime;
	private Date updateTime;
	
	public HotelInfo() {
		// TODO Auto-generated constructor stub
	}

	public HotelInfo(String hotelName, String hotelLocation, int hotelLevel, String hotelIntroduction,
			Date createTime, Date updateTime) {
		super();
		this.hotelName = hotelName;
		this.hotelLocation = hotelLocation;
		this.hotelLevel = hotelLevel;
		this.hotelIntroduction = hotelIntroduction;
		this.createTime = createTime;
		this.updateTime = updateTime;
	}

	public int getHotelInfoId() {
		return hotelInfoId;
	}

	public void setHotelInfoId(int hotelInfoId) {
		this.hotelInfoId = hotelInfoId;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public String getHotelLocation() {
		return hotelLocation;
	}

	public void setHotelLocation(String hotelLocation) {
		this.hotelLocation = hotelLocation;
	}

	public int getHotelLevel() {
		return hotelLevel;
	}

	public void setHotelLevel(int hotelLevel) {
		this.hotelLevel = hotelLevel;
	}

	public String gethotelIntroduction() {
		return hotelIntroduction;
	}

	public void sethotelIntroduction(String hotelIntroduction) {
		this.hotelIntroduction = hotelIntroduction;
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
		return "HotelInfo [hotelInfoId=" + hotelInfoId + ", hotelName=" + hotelName + ", hotelLocation=" + hotelLocation
				+ ", hotelLevel=" + hotelLevel + ", hotelIntroduction=" + hotelIntroduction + ", createTime=" + createTime
				+ ", updateTime=" + updateTime + "]";
	}
	
	
	
	

}
