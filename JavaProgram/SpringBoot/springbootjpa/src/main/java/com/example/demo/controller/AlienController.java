package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.AlienRepo;
import com.example.demo.model.Alien;

@Controller
public class AlienController {
	
	@Autowired
	AlienRepo repo;

	@RequestMapping("/")
	public String home() {
		
		return "home.jsp";
	}
	
	/**
	 * add the alien to db
	 * @param alien
	 * @return
	 */
	@RequestMapping("/addAlien")
	public String addAlien(Alien alien) {
		repo.save(alien);
		return "home.jsp";
	}
	
	/**
	 * to get the alien
	 * @param aid
	 * @return
	 */
	@RequestMapping("/getAlien")
	public ModelAndView getAlien(@RequestParam int aid) {
		
		ModelAndView mv=new ModelAndView("showalien.jsp");
		Alien al = repo.findById(aid).orElse(new Alien());
		mv.addObject(al);
		
		/**
		 * custom method in alienrepo interface should start with
		 * findByXXX() with variable name 
		 */
		System.out.println(repo.findByTech("java"));
		
		System.out.println(repo.findByAidGreaterThan(1));
		
		System.out.println(repo.findByTechSorted("java"));
		
		
		return mv;
	}
	
	@RequestMapping("/aliens")
	/**
	 * to return in REST API format(JSON)
	 * @return
	 */
	@ResponseBody
	/**
	 * we're not returning view name, just returning the data
	 * @return
	 */
	public String getAliens() {
		
		return repo.findAll().toString();
		
	}
	
	@RequestMapping("/alien/{aid}")
	@ResponseBody
	public String getAlienByIDs(@PathVariable("aid") int aid) {
		return repo.findById(aid).toString();
	}
	
}
