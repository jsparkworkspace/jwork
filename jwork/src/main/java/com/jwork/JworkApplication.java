package com.jwork;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class JworkApplication {

	public static void main(String[] args) {

		System.out.println("jwork 시스템 서버 실행!");
		SpringApplication.run(JworkApplication.class, args);
	}

	@GetMapping("/home")
	public void home() {

	}

}
