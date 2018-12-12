package com.fcc.crud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fcc.crud.bean.userInfo;
import com.fcc.crud.dao.userInfoMapper;
@Service
public class UpdateUserService {
	@Autowired
	userInfoMapper userInfoMapper;

	public int insertAll(userInfo userinfo) {
		// TODO Auto-generated method stub
		return userInfoMapper.insert(userinfo);

	 
}
}
