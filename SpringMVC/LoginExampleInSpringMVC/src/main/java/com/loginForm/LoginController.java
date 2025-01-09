package com.loginForm;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
	
	// Display login form
	@RequestMapping(value="/login" ,method=RequestMethod.GET)
	public String showLoginForm(Model model) {
		model.addAttribute("user",new User());
		return "login";
	}
	
	
	/*
	 * When you use @ModelAttribute on a method parameter, Spring automatically
	 * creates an instance of the User class, binds the form data (like userName and
	 * password) to this object, and then passes it to the controller method.
	 *  This saves you from manually extracting individual parameters using @RequestParam
	 * or directly manipulating the request.
	 */	
	
	
	
	
	
    // Process login form submission
	@RequestMapping(value="/login",method=RequestMethod.POST)
	
	//ModelAttribute is whole form data put into class object
	public String processLogin(@ModelAttribute("users") User user,Model model){

		if("admin".equals(user.getUserName()) && "password".equals(user.getPassword()))
		{
			model.addAttribute("msg", "Welcome, "+user.getUserName()+"!");
			return "welcome";
		}else {
			model.addAttribute("error","Invalid username or password. please try again.");
			return "login";
		}	
	}
}
