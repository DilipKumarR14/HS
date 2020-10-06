package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	@RequestMapping("/addAlien")
	public String addAlien(Alien alien) {
		repo.save(alien);
		return "home.jsp";
	}
	
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
		
		System.out.println(repo.findByAidGreaterThan(3));
		
		
		return mv;
		
	}
}
