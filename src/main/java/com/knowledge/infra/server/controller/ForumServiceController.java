package com.knowledge.infra.server.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.support.RequestContextUtils;

import com.knowledge.infra.server.dao.UserDao;
import com.knowledge.infra.server.model.User;
import com.knowledge.infra.server.service.UserService;

@RestController
public class ForumServiceController {

	@Autowired
	private UserService userService;
	

	
	@ExceptionHandler
	public String handleException(Exception e) {

		return e.getMessage();
	}

    @RequestMapping(value = "/forum_service/Register", method = RequestMethod.GET, produces = { "text/javascript;charset=UTF-8" })
    @ResponseBody
    public String Register(HttpServletRequest request) {

    	 User user=new User();
	        //添加两条数据
	     user.setId(1);
	     user.setUsername("Jessica1");
	     user.setPassword("123");
	     userService.addUser(user);
    	
    	return "hehe";

    }
	
}
