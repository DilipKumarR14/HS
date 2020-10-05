package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component()
/**
 * 1. when we specify the @Component spring will create this Object Alien, even if didnt ask in main class
 * because by default Spring follows Singleton design Pattern
 * to Change to @Protoype Design pattern we use @Scope, i.e create object each time when called.
 * 2. Object will not be created when we specify as @Prototype pattern in container when we dont call Alien class
 * in case of @Singleton Object will created even if we dont call
 */
@Scope("prototype")
public class Alien {

	private int id;
	private String name;
	private String tech;
	@Autowired // search the object by TYPe
	/**
	 * Connect to @Laptop, i.e search for the laptop object in container
	 */
	/**
	 * to search the obj by name we can use @Qualifier("lap1") and
	 * in the alien class for the @Component pass the argument as 
	 * @Component("lap1") in Alien class
	 */
	@Qualifier("lap1") // search the obj by NAme
	private Laptop laptop;
	
	public Alien() {
		super();
		System.out.println("Obj created");
	}

	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	
	public void prints() {
		System.out.println("Calling Alien");
		laptop.compiling();
	}
}
