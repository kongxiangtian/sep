package com.fcc.crud.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import com.fcc.crud.bean.shareReport;
import com.fcc.crud.service.ShareReportService;
import com.fcc.crud.utils.Message;

@Controller
public class ShareReportController {
	@Autowired
	ShareReportService shareReportService ;
	@RequestMapping("/share{id}")
	public Message get(HttpServletRequest req,@PathVariable int id) {
		shareReport share = shareReportService.select(id);
		req.setAttribute("share", share);
		return Message.createSuc("3");
	}



}