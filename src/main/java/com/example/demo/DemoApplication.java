package com.example.demo;


import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Angulartesting")
//@Configuration
@SpringBootApplication
public class DemoApplication {

	@Autowired
	Dogreposotoy dogrepo;
	
	private static Logger LOGGER = Logger.getLogger("InfoLogging");

	
	@GetMapping("/findall")
	public Iterable<Dog> findall(){
		 LOGGER.info("Logging an INFO-level From findall");
		return dogrepo.findAll();
		
	}
	@PostMapping("/add")
	public String add( @RequestParam String id, @RequestParam String name, @RequestParam int wight) {
		Dog dog1 = new Dog(id, name, wight);
		dogrepo.save(dog1);
		return dog1.toString();
	}
	  @PostMapping("/dog")
	    void addUser(@RequestBody Dog dog) {
	        dogrepo.save(dog);
	    }
	
	public static void main(String[] args) {
		
		SpringApplication.run(DemoApplication.class, args);
		 LOGGER.info("Logging an INFO-level message");
	}
public void run(String... args) {
	 LOGGER.info("from run message");
}
}
