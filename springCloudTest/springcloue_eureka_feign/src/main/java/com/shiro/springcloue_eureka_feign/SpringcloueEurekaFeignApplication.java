package com.shiro.springcloue_eureka_feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = "com.shiro.springcloue_eureka_feign.interfaces")
public class SpringcloueEurekaFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloueEurekaFeignApplication.class, args);
	}

}

