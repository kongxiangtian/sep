package com.fcc.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fcc.crud.bean.userInfo;
import com.fcc.crud.service.UserInfoService;

@Controller
public class UserInfoController {
	@Autowired
	UserInfoService userInfoService ;
	@RequestMapping(value = "/user{id}",method = RequestMethod.GET)
	@ResponseBody
	public userInfo getUser(@PathVariable int id) {
		userInfo user = userInfoService.select(id);

        return user;
	}

}