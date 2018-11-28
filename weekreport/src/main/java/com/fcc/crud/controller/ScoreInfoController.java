package com.fcc.crud.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import com.fcc.crud.bean.scoreInfo;
import com.fcc.crud.service.ScoreInfoService;
import com.fcc.crud.utils.Message;

@Controller
public class ScoreInfoController {
	@Autowired
	ScoreInfoService scoreInfoService ;
	@RequestMapping("/score{id}")
	public Message getUser(HttpServletRequest req,@PathVariable int id) {
		scoreInfo score = scoreInfoService.select(id);
		req.setAttribute("score", score);
		return Message.createSuc("2");
	}



}
