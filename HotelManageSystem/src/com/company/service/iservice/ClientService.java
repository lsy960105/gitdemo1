package com.company.service.iservice;

import java.util.List;

import com.company.dao.pojo.Client;

public interface ClientService extends BaseService<Client, Integer>{
	List<Client> findByName(String name);
}
