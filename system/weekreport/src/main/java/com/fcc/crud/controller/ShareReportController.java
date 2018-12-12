package com.fcc.crud.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fcc.crud.bean.shareReport;
import com.fcc.crud.service.ShareReportService;
import com.fcc.crud.utils.Message;

@Controller
public class ShareReportController {
	@Autowired
	ShareReportService shareReportService ;
	@RequestMapping(value = "/share{id}",method = RequestMethod.GET)
	@ResponseBody
	public shareReport get(@PathVariable int id) {
		shareReport share = shareReportService.select(id);
		return share;
	}



}