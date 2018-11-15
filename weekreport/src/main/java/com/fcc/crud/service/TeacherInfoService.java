package com.fcc.crud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fcc.crud.bean.teacherInfo;
import com.fcc.crud.dao.teacherInfoMapper;
@Service
public class TeacherInfoService {
	
	@Autowired
	teacherInfoMapper teacherInfoMapper;
	
	public teacherInfo select(int teacherid) {
		// TODO Auto-generated method stub
		return teacherInfoMapper.selectByPrimaryKey(teacherid);
	}
}
