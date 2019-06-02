package io.github.itliwei.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"io.github.itliwei.demo","io.github.itliwei"})
public class MvcormDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MvcormDemoApplication.class, args);
	}

}
