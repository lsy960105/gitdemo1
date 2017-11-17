package com.company.service.dto.result;

import java.math.BigInteger;

public class ReportByGender {
	private String gender;
	private BigInteger count;
	private String ageGroup;
	
	
	public ReportByGender() {
		// TODO Auto-generated constructor stub
	}


	public ReportByGender(String gender, BigInteger count, String ageGroup) {
		super();
		this.gender = gender;
		this.count = count;
		this.ageGroup = ageGroup;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public BigInteger getCount() {
		return count;
	}


	public void setCount(BigInteger count) {
		this.count = count;
	}


	public String getAgeGroup() {
		return ageGroup;
	}


	public void setAgeGroup(String ageGroup) {
		this.ageGroup = ageGroup;
	}


	@Override
	public String toString() {
		return "ReportByGender [gender=" + gender + ", count=" + count + ", ageGroup=" + ageGroup + "]";
	}
	
	
	
}
