package com.company.service.dto.result;

import java.math.BigDecimal;

public class ReportByClientType {

	private String quarter;
	private String roomTypeName;
	private BigDecimal inNum;
	private Double income;
	
	public ReportByClientType() {
		// TODO Auto-generated constructor stub
	}

	public ReportByClientType(String quarter, String roomTypeName, BigDecimal inNum, Double income) {
		super();
		this.quarter = quarter;
		this.roomTypeName = roomTypeName;
		this.inNum = inNum;
		this.income = income;
	}

	public String getQuarter() {
		return quarter;
	}

	public void setQuarter(String quarter) {
		this.quarter = quarter;
	}

	public String getRoomTypeName() {
		return roomTypeName;
	}

	public void setRoomTypeName(String roomTypeName) {
		this.roomTypeName = roomTypeName;
	}

	public BigDecimal getInNum() {
		return inNum;
	}

	public void setInNum(BigDecimal inNum) {
		this.inNum = inNum;
	}

	public Double getIncome() {
		return income;
	}

	public void setIncome(Double income) {
		this.income = income;
	}

	@Override
	public String toString() {
		return "ReportByClientType [quarter=" + quarter + ", roomTypeName=" + roomTypeName + ", inNum=" + inNum
				+ ", income=" + income + "]";
	}
	
}
