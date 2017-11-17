package com.company.service.dto.result;

import java.util.List;

import com.company.dao.pojo.HotelInfo;
import com.company.dao.pojo.Message;

public class InfosOfHM {
	
	private HotelInfo hotelInfo;
	private List<Message> messages;
	public InfosOfHM(HotelInfo hotelInfo, List<Message> messages) {
		super();
		this.hotelInfo = hotelInfo;
		this.messages = messages;
	}
	
	
	public InfosOfHM() {
		// TODO Auto-generated constructor stub
	}


	public HotelInfo getHotelInfo() {
		return hotelInfo;
	}


	public void setHotelInfo(HotelInfo hotelInfo) {
		this.hotelInfo = hotelInfo;
	}


	public List<Message> getMessages() {
		return messages;
	}


	public void setMessages(List<Message> messages) {
		this.messages = messages;
	}


	@Override
	public String toString() {
		return "InfosOfHM [hotelInfo=" + hotelInfo + ", messages=" + messages + "]";
	}
	
	
	
}


