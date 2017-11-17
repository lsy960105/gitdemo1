package com.company.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.company.dao.pojo.Client;
import com.company.service.dto.result.HotelOrderFuntion;
import com.company.service.iservice.ClientService;
import com.company.service.iservice.OrderItemsService;
import com.company.service.iservice.OrderService;
import com.company.service.iservice.RoomInfoService;
import com.opensymphony.xwork2.ModelDriven;


@Controller("hotelOrderFunctionAaction")
@Scope("prototype")
public class HotelOrderFuntionAction implements ModelDriven<HotelOrderFuntion>{

	@Autowired
	private ClientService clientServcice;
	@Autowired
	private RoomInfoService roomInfoService;
	@Autowired
	private OrderService orderService;
	@Autowired
	private OrderItemsService orderItemsService;
	
	private HotelOrderFuntion HotelOrderFuntionModel = new HotelOrderFuntion();
	
	
	
	@Override
	public HotelOrderFuntion getModel() {
		return HotelOrderFuntionModel;
	}
	
	
	
	public String function(){
		String msg = "error";
		
		
		return msg;
	}
	
	

}
