package com.fcc.crud.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fcc.crud.bean.everyReport;
import com.fcc.crud.service.EveryReportService;
import com.fcc.crud.utils.Message;

@Controller
public class EveryReportController {
	@Autowired
	EveryReportService everyReportService ;
	@RequestMapping("/everyreport{id}")
	public Message getUser(HttpServletRequest req,@PathVariable int id) {
		String username=req.getParameter("username");
		String lastweek=req.getParameter("lastweek");
		String thisweek=req.getParameter("thisweek");
		String attachurl=req.getParameter("attachurl");
		String QandA=req.getParameter("QandA");
		String nextweek=req.getParameter("nextweek");
		String reportdes=req.getParameter("reportdes");
		int ID=id;
		everyReport everyreport=new everyReport();
		everyreport.setUsername(username);
		everyreport.setLastweek(lastweek);
		everyreport.setThisweek(thisweek);
		everyreport.setAttachurl(attachurl);
		everyreport.setQanda(QandA);
		everyreport.setNextweek(nextweek);
		everyreport.setReportdes(reportdes);
		everyreport.setUserid(ID);
		return Message.createSuc(everyReportService.insertAll(everyreport));
	}

}
