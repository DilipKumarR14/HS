package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller// this is controller 
public class HomeController {
	
	@RequestMapping("home")
	/**
	 * call the home.jsp file need to download the tomcat jasper
	 * version similar to embedded tomcat
	 * @requestparam("name") name is from URL, mapping to Myname
	 */
	public ModelAndView home(Alien alien) {
		/**
		 *  1. instead of home.jsp if i want to specify just "home"
		 *  add the prefix, suffix in appliaction.properties files
		 *  i.e to separate the extension .jsp,
		 *  2. Modelview for adding the object from URL, 
		 * 	Set the view which is "home"
		 *  3. To pass multiple params from URL 1:17:55
		 */
		ModelAndView mv = new ModelAndView();
		mv.addObject("obj", alien);
		mv.setViewName("home");
		return mv;
	}
}
