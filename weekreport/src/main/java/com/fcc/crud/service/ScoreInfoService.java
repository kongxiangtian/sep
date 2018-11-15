package com.fcc.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fcc.crud.bean.scoreInfo;
import com.fcc.crud.dao.scoreInfoMapper;
@Service
public class ScoreInfoService {
	@Autowired
	scoreInfoMapper scoreInfoMapper;

	public scoreInfo select(int scoreid) {
		// TODO Auto-generated method stub
		return scoreInfoMapper.selectByPrimaryKey(scoreid);

	
}
}