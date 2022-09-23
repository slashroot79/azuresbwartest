package com.rk.rkwarapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class RkwarappApplication {

	public static void main(String[] args) {
		SpringApplication.run(RkwarappApplication.class, args);
	}

	@RequestMapping("/")
	public String test(){
		return "App's up and running";
	}

}
