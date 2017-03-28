package com.leo.sc.br.service;

import java.util.List;

import com.leo.sc.br.dao.IGenericDAO;

public interface IGenericService<T> extends IGenericDAO<T> {

	  List<T> getAll();
	  void deleteAll();
	
}
