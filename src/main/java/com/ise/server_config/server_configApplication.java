package com.ise.server_config;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@org.springframework.boot.autoconfigure.SpringBootApplication
@EnableConfigServer
public class server_configApplication {

	public static void main(String[] args) {
		SpringApplication.run(server_configApplication.class, args);
	}

}
