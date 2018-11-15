package com.fcc.crud.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fcc.crud.bean.userInfo;
import com.fcc.crud.service.RegisterService;
import com.fcc.crud.utils.Message;

@Controller
public class RegisterController {
	@Autowired
	RegisterService registerService ;
	@RequestMapping("/register")
	public Message getRegister(HttpServletRequest req) {
		String name=req.getParameter("user");
		String psw=req.getParameter("psw");
		userInfo userinfo=new userInfo();
		userinfo.setAccount(name);
		userinfo.setPassword(psw);
		return Message.createSuc(registerService.insertAll(userinfo));
	}



}
