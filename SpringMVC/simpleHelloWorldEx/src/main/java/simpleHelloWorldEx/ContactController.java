package simpleHelloWorldEx;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.model.User;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class ContactController {

	//same type Data multiple access

	@ModelAttribute
	public void commonDataForModel(Model m) {
		m.addAttribute("header1", "Registration Form1");
		System.out.println("i am common method...");
	}

	
	
	
	
	@RequestMapping("/contact")
	public String showForm(Model m) {
		m.addAttribute("header", "Registration Form");
		System.out.println("I am ShowForm method...");
		return "contact";
	}

	
	
	
	
	
	// simple way

	/*
	 * @RequestMapping(path="/processForm",method = RequestMethod.POST) public
	 * String handleForm(HttpServletRequest req) { String email =
	 * req.getParameter("email"); System.out.println(email); return ""; }
	 */

	
	
	
	
	
	
	
	/*
	 * //@RequestParam is a Binding Field in contact.jsp
	 * 
	 * @RequestMapping(path="/processForm",method=RequestMethod.POST) public String
	 * handleForm(@RequestParam("userName") String userName,@RequestParam("email")
	 * String email,@RequestParam("password") String password,Model model) {
	 * 
	 * //using reqParam and model
	 * 
	 * // System.out.println("User Name: "+userName); //
	 * System.out.println("User Email: "+email); //
	 * System.out.println("User Password: "+password);
	 * 
	 * //Model is using for data get through success.jsp in processform //
	 * model.addAttribute("name",userName); // model.addAttribute("email",email); //
	 * model.addAttribute("password", password);
	 * 
	 * 
	 * //using simple way handle model
	 * 
	 * User user = new User(); user.setUserName(userName); user.setEmail(email);
	 * user.setPassword(password);
	 * 
	 * System.out.println(user);
	 * 
	 * model.addAttribute("user",user);
	 * 
	 * return "success"; }
	 */

	
	
	
	
	
	
	
	// -> using modelAttribute

	@RequestMapping(path = "/processForm", method = RequestMethod.POST)
	public String handleForm(@ModelAttribute User user, Model model) {
		
		  System.out.println(user);
//		   model.addAttribute("user",user);
		 
		return "success";
	}

}
