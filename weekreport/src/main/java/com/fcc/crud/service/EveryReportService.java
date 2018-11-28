package com.fcc.crud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fcc.crud.bean.everyReport;
import com.fcc.crud.dao.everyReportMapper;
@Service
public class EveryReportService {
	
	@Autowired
	everyReportMapper everyReportMapper;

	
	public int insertAll(everyReport everyreport) {
		// TODO Auto-generated method stub
		return everyReportMapper.insert(everyreport);
	
	}
}
