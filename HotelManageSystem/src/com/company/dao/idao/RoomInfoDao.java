package com.company.dao.idao;

import java.util.Date;

import com.company.dao.pojo.RoomInfo;

public interface RoomInfoDao extends BaseDao<RoomInfo, Integer> {
	
	RoomInfo findByCondition(Date orderdate,int roomTypeId)throws Exception;

}
