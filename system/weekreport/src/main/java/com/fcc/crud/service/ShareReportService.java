package com.fcc.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fcc.crud.bean.shareReport;
import com.fcc.crud.dao.shareReportMapper;
@Service
public class ShareReportService {
	@Autowired
	shareReportMapper shareReportMapper;
	
	public shareReport select(int shareid) {
		// TODO Auto-generated method stub
		return shareReportMapper.selectByPrimaryKey(shareid);
	
	}
}
