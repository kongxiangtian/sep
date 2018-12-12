package com.fcc.crud.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fcc.crud.bean.myNews;
import com.fcc.crud.bean.scoreInfo;
import com.fcc.crud.service.MyNewsService;
import com.fcc.crud.service.ScoreInfoService;
import com.fcc.crud.utils.Message;

@Controller
public class MyNewsController {
	@Autowired
	MyNewsService myNewsService ;
	@RequestMapping(value="/myNews{id}",method = RequestMethod.GET)
	@ResponseBody
	public myNews getUser(@PathVariable int id ) {
		
		 
		 myNews myNews = myNewsService.select(id);
		 return myNews ;
	}



}
