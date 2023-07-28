package com.sdec.Core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.PostMapping;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class CoreApplication {
	@PostMapping("/test")
	public String testApi()
	{
		System.out.println("hello world");
		return ("Hello World");
	}
	public static void main(String[] args)
	{
		SpringApplication.run(CoreApplication.class, args);
	}

}
