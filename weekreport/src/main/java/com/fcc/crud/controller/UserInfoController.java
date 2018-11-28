package com.fcc.crud.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import com.fcc.crud.bean.userInfo;
import com.fcc.crud.service.UserInfoService;
import com.fcc.crud.utils.Message;

@Controller
public class UserInfoController {
	@Autowired
	UserInfoService userInfoService ;
	@RequestMapping("/user{id}")
	public Message getUser(HttpServletRequest req,@PathVariable int id) {
		userInfo user = userInfoService.select(id);
		req.setAttribute("user", user);

        return Message.createSuc("µÇ³ö³É¹¦");
	}

}