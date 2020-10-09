package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.AlienRepo;
import com.example.demo.model.Alien;

@RestController
public class AlienController {
	
	@Autowired
	AlienRepo repo;

	@RequestMapping("/")
	public String home() {
		
		return "home.jsp";
	}
	
	/**
	 * add the alien to db
	 * "consumes={application/json}" param can be added to PostMapping
	 * @param alien
	 * @return alien
	 */
	@PostMapping("/alien")
	public Alien addAlien(@RequestBody Alien alien) {
		repo.save(alien);
		return alien;
	}
	
	
	@RequestMapping("/alien/{aid}")
	public Optional<Alien> getAlienByIDs(@PathVariable("aid") int aid) {
		return repo.findById(aid);
	}
	
	/**
	 * to return in REST API format(JSON)
	 * @return
	 */
	/**
	 * @ResponseBody
	 * we're not returning view name, just returning the data
	 * @return
	 */
	@GetMapping("/aliens")
	public List<Alien> getAliens() {
		
		return repo.findAll();
		
	}
	
	@DeleteMapping("/alien/delete/{aid}")
	public String deleteAlien(@PathVariable int aid) {
		
		Alien alien = repo.getOne(aid);
		repo.delete(alien);
		return "deleted!!!";
	}
	
	
	@PutMapping("/alien")
	public Alien saveorUpdateAlien(@RequestBody Alien alien) {
		System.out.println(alien.toString());
		repo.save(alien);
		return alien;
	}

	/**
	 * to get the alien
	 * @param aid
	 * @return
	 */
//	@RequestMapping("/getAlien")
//	public ModelAndView getAlien(@RequestParam int aid) {
//		
//		ModelAndView mv=new ModelAndView("showalien.jsp");
//		Alien al = repo.findById(aid).orElse(new Alien());
//		mv.addObject(al);
//		
//		/**
//		 * custom method in alienrepo interface should start with
//		 * findByXXX() with variable name 
//		 */
//		System.out.println(repo.findByTech("java"));
//		
//		System.out.println(repo.findByAidGreaterThan(1));
//		
//		System.out.println(repo.findByTechSorted("java"));
//		
//		
//		return mv;
//	}
	
	
//	@RequestMapping(path="/alienss", produces= {"application/json"})
	/**
	 * to return in REST API format(JSON)
	 * "produces" is used to restrict the format to be returned
	 * @return
	 */
//	@ResponseBody
	/**
	 * we're not returning view name, just returning the data
	 * @return
	 */
//	public List<Alien> getAlienss() {
//		
//		return repo.findAll();
//		
//	}
//	
//	@RequestMapping("/alienss/{aid}")
//	@ResponseBody
//	public Optional<Alien> getAlienByIDss(@PathVariable("aid") int aid) {
//		return repo.findById(aid);
//	}
	
}
