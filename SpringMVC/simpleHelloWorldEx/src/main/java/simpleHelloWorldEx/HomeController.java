package simpleHelloWorldEx;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
//@RequestMapping("/first")
public class HomeController {

	
	
	//Model 
	
	/*
	 * Model Purpose: Primarily used to add attributes to the model.
	 * 
	 * Usage: You typically use it when you just need to pass data to the view and
	 * specify the view name separately by returning a String.
	 * 
	 * Simplicity: It's simpler and more concise for straightforward scenarios.
	 * 
	 * Method Signature: The method returns a String representing the view name.
	 */
	
	@RequestMapping("/home")
	public String home(Model model) {
		System.out.println("This is home url");
		
		//we are get in servlet
		model.addAttribute("name","Rahul sosa");
		model.addAttribute("Id", 1047);
		
		List<String> friends = new ArrayList<String>();
		friends.add("Rahul");
		friends.add("Chinmay");
		friends.add("Abhinav");
		friends.add("Karan");
		friends.add("Yaksha");
		model.addAttribute("f",friends);
		return "index";
	}
	
	
	@RequestMapping("/about")
	public String about() {
		return "about";
	}
	
	
	
	
	//ModelAndView
	
	
	/*
	 * ModelAndView Purpose: Encapsulates both model data and view information in a
	 * single object.
	 * 
	 * Usage: Used when you want to return both the view name and the model in one
	 * object.
	 * 
	 * Flexibility: Provides more flexibility, allowing you to configure both the
	 * view and model in one place.
	 * 
	 * Method Signature: The method returns a ModelAndView object, which contains
	 * both the view name and model attributes.
	 */
	
	@RequestMapping("/help")
	public ModelAndView help() {
		ModelAndView modelAndView = new ModelAndView();
		
		modelAndView.addObject("Name","Uttam");
		modelAndView.addObject("RollNo",1047);
		
		
		LocalDateTime now = LocalDateTime.now();
		
		modelAndView.addObject("Time",now);
		
		modelAndView.setViewName("help"); //set the view explicitly
	
		//marks
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(12);
		list.add(1243);
		list.add(1552);
		list.add(152);
		list.add(0012);
		
		modelAndView.addObject("Marks",list);
		
		return modelAndView;
	}
}
