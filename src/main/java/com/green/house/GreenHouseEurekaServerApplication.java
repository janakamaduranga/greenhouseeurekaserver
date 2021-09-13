package com.green.house;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class GreenHouseEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(GreenHouseEurekaServerApplication.class, args);
	}

}
