package com.practice.webmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/add")
public class MultiplicationController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String add() {		
		System.out.println("output");
		return "output.jsp";
	}

}
