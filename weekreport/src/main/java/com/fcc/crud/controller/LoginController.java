package com.fcc.crud.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.fcc.crud.bean.userInfo;
import com.fcc.crud.service.UserInfoService;
import com.fcc.crud.utils.Message;

@Controller
public class LoginController {
	@Autowired
	UserInfoService userInfoService ;
	@RequestMapping("/login")
	public  Message isTrue(HttpServletRequest req) {
		String username = req.getParameter("user");
		String psw = req.getParameter("psw");
		if(username==null) {};
		if(psw==null)  {};
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
					req.setAttribute("id",userInfo1.getUserid());
				}
			}
		req.setAttribute("c", c);
		int idd=(Integer) req.getAttribute("id");
		System.out.println(c);
		String d=(String) req.getAttribute("c");
		System.out.println(idd);
		System.out.println(d);
		return  Message.createSuc("µÇ³ö³É¹¦");
	}	
	



}