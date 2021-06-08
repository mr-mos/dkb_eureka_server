package de.moscon.dkb_eureka_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class DkbEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DkbEurekaServerApplication.class, args);
	}

}
