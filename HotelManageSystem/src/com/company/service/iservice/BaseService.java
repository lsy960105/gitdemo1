package com.company.service.iservice;

import java.util.List;

public interface BaseService<T,K> {
	String save(T t);

	String update(T t);

	String delete(T t);

	T findById(K k);
	
	List<T> findByPage(int pageNo,int pageSize);

}
