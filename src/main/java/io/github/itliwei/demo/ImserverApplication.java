package io.github.itliwei.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"io.github.itliwei.demo","io.github.itliwei"})
public class ImserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(ImserverApplication.class, args);
	}

}
