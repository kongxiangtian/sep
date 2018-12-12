package com.fcc.crud.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.fcc.crud.bean.teacherInfo;
import com.fcc.crud.service.TeacherInfoService;
import com.fcc.crud.utils.Message;

@Controller
public class TeacherInfoController {
	@Autowired
	TeacherInfoService teacherInfoService ;
	@RequestMapping(value="/teacher{id}",method = RequestMethod.GET)
	@ResponseBody
	public teacherInfo getUser(@PathVariable int id ) {
		
		 
		teacherInfo teacherInfo = teacherInfoService.select(id);
		 return teacherInfo ;
	}



}
