package de.moscon.dkb_eureka_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/*
     https://github.com/spring-guides/gs-service-registration-and-discovery

     Status-Page: http://localhost:8761/
 */

@EnableEurekaServer
@SpringBootApplication
public class DkbEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DkbEurekaServerApplication.class, args);
	}

}
