package com.fcc.crud.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fcc.crud.bean.teacherInfo;
import com.fcc.crud.service.TeacherInfoService;
import com.fcc.crud.utils.Message;

@Controller
public class TeacherInfoController {
	@Autowired
	TeacherInfoService teacherInfoService ;
	@RequestMapping("/teacherinfo{id}")
	public Message getUser(HttpServletRequest req,@PathVariable int id) {
		teacherInfo teacher = teacherInfoService.select(id);
		req.setAttribute("teacher", teacher);
		return Message.createSuc("4");
	}
}
