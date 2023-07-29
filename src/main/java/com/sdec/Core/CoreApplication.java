package com.sdec.Core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class CoreApplication {

	/**
	 * To test the data appearing on the webpage
	 */
	@RestController
	public static class Souvik
	{
		@RequestMapping("/test")
		public String hello()
		{
			return "Hello Souvik";
		}
	}
	public static void main(String[] args)
	{
		SpringApplication.run(CoreApplication.class, args);
	}

}
