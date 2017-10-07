package com.oreily;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication // В данном случае аннотация @SpringBootApplication заменяет собой аннотации @Configuration, @EnableAutoConfiguration и @ComponentScan.
@RestController
//@EnableConfigurationProperties(value = MyMessage.class)
public class SpringbootdemoApplication {

	@Autowired
	ApplicationArguments applicationArguments;

	@Autowired
	private MyMessage myMessage;

	@RequestMapping("/")
	public String welcome(){
		String value = applicationArguments.getOptionNames().iterator().next();

		//return "welcome, your lucky number is " + myMessage.getMessageValue();

		return "welcome, your lucky number is " + value;
	}


/*	@Value("${name}")
	String name;

	@Autowired
	String message;

	@RequestMapping("/")
	public String home(){
		return message;
	}*/

	public static void main(String[] args) {
		SpringApplication.run(SpringbootdemoApplication.class, args);
	}

}
