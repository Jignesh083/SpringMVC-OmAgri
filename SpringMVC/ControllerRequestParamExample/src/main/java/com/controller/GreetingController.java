package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


//received request from the client and sent back the response to client
@Controller
public class GreetingController {

	// This method handles GET requests for the /greet URL
	@GetMapping("/greet")
	//@RequestParam is used to get data and model interface to send data to another page.
	//@RequestParam is used to extract query parameters from the request
	//@RequestParam get value one by one parameter in view file.
	public String greet(@RequestParam(name="name",required=false,defaultValue = "Guest") String name,Model model) {
		model.addAttribute("message","Hello, "+name+"!");
		return "greeting";
	}
}
