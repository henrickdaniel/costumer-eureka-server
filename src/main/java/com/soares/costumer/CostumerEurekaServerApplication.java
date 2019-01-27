package com.soares.costumer;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringCloudApplication
public class CostumerEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CostumerEurekaServerApplication.class, args);
	}
}
