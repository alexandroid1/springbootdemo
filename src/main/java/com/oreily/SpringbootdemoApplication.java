package com.oreily;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication // В данном случае аннотация @SpringBootApplication заменяет собой аннотации @Configuration, @EnableAutoConfiguration и @ComponentScan.
@Import(MyConfiguration.class)

//@EnableAutoConfiguration
public class SpringbootdemoApplication {

	@Value("${name}")
	String name;

	@RequestMapping("/")
	public String home(){
		return name;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootdemoApplication.class, args);
	}

}
