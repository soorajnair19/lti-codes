package com.lti.model;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controller1 {

	@RequestMapping({"/login", "/signin"})
	public String req1()
	{
		return "success";
	}
	
}
