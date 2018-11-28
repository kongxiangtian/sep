package com.fcc.crud.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fcc.crud.bean.userInfo;
import com.fcc.crud.service.UserInfoService;
import com.fcc.crud.utils.Message;

@Controller
public class LoginController {
	@Autowired
	UserInfoService userInfoService ;
	@RequestMapping(value="/login",produces = "application/json;charset=UTF-8")
	@ResponseBody
	public  String isTrue(@RequestParam(value="username",required=false)String username,@RequestParam(value="psw",required=false)String psw) {
		
		
		if(username==null) {
			username="12";
		};
		if(psw==null)  {
			psw="2";
		};
		System.out.println(username);
		System.out.println(psw);
		String c="0";
		
			List<userInfo> user = userInfoService.getAll();
			int count = user.size();
			for(int i=0;i<count;i++){
				userInfo userInfo1 = user.get(i);
				String a = userInfo1.getAccount();
				String b = userInfo1.getPassword();
				if(username.equals(a) && psw.equals(b)){
					c="1";
				
				}
			}
	
		System.out.println(c);

		
		return  c;
	}	
	



}