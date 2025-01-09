package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {
	
	// Maps HTTP GET requests to /greet
	@RequestMapping(value="/greet",method = RequestMethod.GET)
	public String greet(@RequestParam(name="name",required=false,defaultValue = "Guest") String name,Model model) {
		model.addAttribute("msg","Hello, "+name+"!");
		return "greeting";
	}
	
	// Maps HTTP POST requests to /submit
	@RequestMapping(value="/submit",method = RequestMethod.POST)
	public String submitForm(@RequestParam(name = "data",defaultValue = "Thank you") String data,Model model) {
		model.addAttribute("response","You Submitted: "+data);
		return "response";
	}
	
}
