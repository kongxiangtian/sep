package com.fcc.crud.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fcc.crud.bean.scoreInfo;
import com.fcc.crud.service.ScoreInfoService;
import com.fcc.crud.utils.Message;

@Controller
public class ScoreInfoController {
	@Autowired
	ScoreInfoService scoreInfoService ;
	@RequestMapping(value="/score{id}",method = RequestMethod.GET)
	@ResponseBody
	public scoreInfo getUser(@PathVariable int id ) {
		
		 
		 scoreInfo scoreInfo = scoreInfoService.select(id);
		 return scoreInfo ;
	}



}
