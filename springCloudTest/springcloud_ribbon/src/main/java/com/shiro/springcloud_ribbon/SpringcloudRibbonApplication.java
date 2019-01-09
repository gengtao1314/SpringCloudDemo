package com.shiro.springcloud_ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
@EnableEurekaClient
public class SpringcloudRibbonApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudRibbonApplication.class, args);
	}

	@Bean
	@LoadBalanced
	RestTemplate restTemplate(){return new RestTemplate();}

	@GetMapping("/")
	public String info(){return restTemplate().getForObject("http://service/",String.class);}
}

