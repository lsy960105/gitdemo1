package com.company.dao.idao;

import java.util.List;

public interface BaseDao<T,K> {
	
	int pageSize = 5;
	
	void save(T t) throws Exception;
	
	void delete(T t) throws Exception;
	
	void update(T t) throws Exception;
	
	T findById(K k) throws Exception;
	
	List<T> findByPage(int pageNo,int pageSize) throws Exception;

}
