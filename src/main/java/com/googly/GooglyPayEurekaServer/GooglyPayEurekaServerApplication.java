package com.googly.GooglyPayEurekaServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class GooglyPayEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(GooglyPayEurekaServerApplication.class, args);
	}

}
