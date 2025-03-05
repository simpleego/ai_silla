package com.simple.boardprj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BoardprjApplication {

	public static void main(String[] args) {
		SpringApplication.run(BoardprjApplication.class, args);
		String msg = "Hello SpringBoot";
		System.out.println(msg);

	}

}
