package com.company.dao.idao;

import java.util.List;

import com.company.dao.pojo.Client;

public interface ClientDao extends BaseDao<Client, Integer> {
	List<Client> findByName(String name);
}
