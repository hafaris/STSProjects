package com.sts.stsdemo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@SpringBootApplication
public class Stsdemo2Application {

	public static void main(String[] args) {
		SpringApplication.run(Stsdemo2Application.class, args);
		HelloController h1= new HelloController();
		h1.hello();
	}

}

