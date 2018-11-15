package com.fcc.crud.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fcc.crud.bean.userInfo;
import com.fcc.crud.service.UpdateUserService;
import com.fcc.crud.utils.Message;

@Controller
public class UpdateUserController {
	@Autowired
	UpdateUserService updateuserService ;
	@RequestMapping("/updateuser{id}")
	public Message updateUser(HttpServletRequest req,@PathVariable int id) {
		String name=req.getParameter("username");
		String sex=req.getParameter("sex");
		String dep=req.getParameter("department");
		String tecname=req.getParameter("teachername");
		String teades=req.getParameter("teacherdes");
		int ID = id;
		userInfo userinfo=new userInfo();
		userinfo.setUsername(name);
		userinfo.setSex(sex);
		userinfo.setDepartment(dep);
		userinfo.setTeachername(tecname);
		userinfo.setTeacherdes(teades);
		return Message.createSuc(updateuserService.insertAll(userinfo));
	}



}
