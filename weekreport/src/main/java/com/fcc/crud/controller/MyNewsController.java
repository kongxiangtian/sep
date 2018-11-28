package com.fcc.crud.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fcc.crud.bean.myNews;
import com.fcc.crud.service.MyNewsService;
import com.fcc.crud.utils.Message;

@Controller
public class MyNewsController {
	@Autowired
	MyNewsService MyNewsService ;
	@RequestMapping("/mynews{id}")
	public Message getMyNews(HttpServletRequest req) {
		List<myNews> mynews = MyNewsService.getAll();
		req.setAttribute("mynews", mynews);
		 return Message.createSuc("µÇ³ö³É¹¦");
	}
}
