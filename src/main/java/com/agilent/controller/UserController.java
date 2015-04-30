package com.agilent.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.agilent.dao.UserDao;
import com.agilent.model.User;

@Controller
public class UserController {

	@Autowired
	private UserDao userDao;
	
	@RequestMapping(value="/get/{id}", method=RequestMethod.GET)
	public String getUser(@PathVariable long id, Model model) {
		User user = userDao.getUser(id);
		model.addAttribute("user",user);
		
		return "users"; 			
	}
	
	/*@RequestMapping(value="/get/{id}", method=RequestMethod.GET)
	public  User getUser(@PathVariable("id") long id) {
		User user = userDao.getUser(id);		
		return user; 			
	}*/
	
}
