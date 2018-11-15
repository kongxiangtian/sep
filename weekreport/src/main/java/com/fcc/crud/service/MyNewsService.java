package com.fcc.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fcc.crud.bean.myNews;
import com.fcc.crud.dao.myNewsMapper;
@Service
public class MyNewsService {
	@Autowired
	myNewsMapper myNewsMapper;
	
	public List<myNews> getAll() {
		// TODO Auto-generated method stub
		return myNewsMapper.selectByExample(null);
	
	}
}
