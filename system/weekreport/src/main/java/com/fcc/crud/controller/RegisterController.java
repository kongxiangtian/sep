package com.fcc.crud.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fcc.crud.bean.userInfo;
import com.fcc.crud.service.RegisterService;

import com.fcc.crud.utils.Message;

@Controller
public class RegisterController {
	@Autowired
	RegisterService registerService ;
	
	@RequestMapping(value="/register",method = RequestMethod.POST)
	@ResponseBody
	public Message updateUser(@RequestParam(value="username",required=false)String name,
			                  @RequestParam(value="department",required=false)String dep,
			                  @RequestParam(value="sex",required=false)String sex,
			                  @RequestParam(value="teachername",required=false)String tecname,
			                  @RequestParam(value="teacherdes",required=false)String tecid
			                 ) {
		
		
		userInfo userinfo=new userInfo();
		userinfo.setUsername(name);
		userinfo.setSex(sex);
		userinfo.setDepartment(dep);
		userinfo.setTeachername(tecname);
		userinfo.setTeacherdes(tecid);
		return Message.createSuc(registerService.insertAll(userinfo));
	}



}