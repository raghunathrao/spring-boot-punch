package com.org.punch;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
// @EnablePrometheusMetrics
public class SpringBootPunchApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootPunchApplication.class, args);
	}

}
