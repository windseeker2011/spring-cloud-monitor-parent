package com.windseeker2011.cloud.mircoservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

/**
 * 第三个微服务
 * 
 * @author Weihai Li
 *
 */
@RestController
@Slf4j
@EnableEurekaClient
@SpringBootApplication
public class Service3Application {

	/**
	 * 一层调用
	 * 
	 * @return
	 */
	@GetMapping(value = "/1")
	public String m1() {
		log.info("我是微服务3号。。。");
		return "success";
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Service3Application.class, args);

	}

}
