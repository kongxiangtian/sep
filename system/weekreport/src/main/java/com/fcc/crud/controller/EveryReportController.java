package com.fcc.crud.controller;

import java.sql.Date;
import java.sql.Time;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fcc.crud.bean.everyReport;
import com.fcc.crud.service.EveryReportService;
import com.fcc.crud.utils.Message;

@Controller
public class EveryReportController {
	@Autowired
	EveryReportService everyReportService ;
	@RequestMapping(value="/everyreport",method = RequestMethod.POST)
	@ResponseBody
	public Message insert(
            @RequestParam(value="username",required=false)String username,
            @RequestParam(value="date",required=false)Date date,
            @RequestParam(value="time",required=false)Time time,
            @RequestParam(value="lastweek",required=false)String lastweek,
            @RequestParam(value="thisweek",required=false)String thisweek,
            @RequestParam(value="attachurl",required=false)String attachurl,
            @RequestParam(value="QandA",required=false)String QandA,
            @RequestParam(value="reportdes",required=false)String reportdes,
            @RequestParam(value="nextweek",required=false)String nextweek
           ) {
	
		everyReport everyreport=new everyReport();
		everyreport.setUsername(username);
		everyreport.setLastweek(lastweek);
		everyreport.setThisweek(thisweek);
		everyreport.setAttachurl(attachurl);
		everyreport.setQanda(QandA);
		everyreport.setNextweek(nextweek);
		everyreport.setReportdes(reportdes);
		return Message.createSuc(everyReportService.insertAll(everyreport));
	}

}
