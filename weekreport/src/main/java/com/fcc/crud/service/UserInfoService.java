package com.fcc.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fcc.crud.bean.userInfo;
import com.fcc.crud.dao.userInfoMapper;
@Service
public class UserInfoService {
	@Autowired
	userInfoMapper userInfoMapper;

	public userInfo select(int userid) {
		// TODO Auto-generated method stub
		return userInfoMapper.selectByPrimaryKey(userid);

	
}
	public List<userInfo> getAll() {
		// TODO Auto-generated method stub
		return userInfoMapper.selectByExample(null);
	
	}
}
