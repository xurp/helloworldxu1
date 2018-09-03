package com.example.helloworldxu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloworldxuApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloworldxuApplication.class, args);
	}
	
	 @RequestMapping("/*/")
	    public String home() {
	    	System.out.println("home");
	        return "Hello Docker World";
	    }
}
