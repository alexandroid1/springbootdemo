package com.oreily;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
@SpringBootApplication // В данном случае аннотация @SpringBootApplication заменяет собой аннотации @Configuration, @EnableAutoConfiguration и @ComponentScan.
//@EnableAutoConfiguration
public class SpringbootdemoApplication {

	@RequestMapping("/")
	public String home(){
		return "Hello World";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootdemoApplication.class, args);
	}

}
