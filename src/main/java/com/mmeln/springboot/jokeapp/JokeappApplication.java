package com.mmeln.springboot.jokeapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JokeappApplication {

	public static void main(String[] args) {
		SpringApplication.run(JokeappApplication.class, args);
		/*ApplicationContext ctx = SpringApplication.run(JokeappApplication.class, args);
		JokeService jokeService = (JokeService) ctx.getBean("jokeServiceImpl");
		System.out.println("Joke : " + jokeService.getJoke());*/
	}

}
