package com.ivandelvaller.mvcbeer.mvcbeer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "com.ivandelvaller.mvcbeer" })
public class MvcbeerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MvcbeerApplication.class, args);
	}

}
