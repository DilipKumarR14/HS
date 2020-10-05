package com.example.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller// this is controller 
public class HomeController {
	
	@RequestMapping("home")
	/**
	 * call the home.jsp file need to download the tomcat jasper
	 * version similar to embedded tomcat
	 */
	public String home(HttpServletRequest req) {
		/**
		 *  instead of home.jsp if i want to specify just "home"
		 *  add the prefix, suffix in appliaction.properties files
		 *  i.e to separate the extension .jsp
		 */
		// to get the param from URL
		String username = req.getParameter("name");
		// to pass the value from name to web page
		HttpSession hs = req.getSession();
		System.out.println("name--> :"+username);
		hs.setAttribute("name", username);
		return "home";
	}
}
