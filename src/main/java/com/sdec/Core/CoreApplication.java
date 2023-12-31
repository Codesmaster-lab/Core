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

	/**
	 * To test the data appearing on the webpage
	 */
	@RestController
	public static class Souvik1
	{
		@RequestMapping("/test1")
		public String hello()
		{
			return "Hello SouvikDas";
		}
	}

	/**
	 * To test the data appearing on the webpage
	 */
	@RestController
	public static class Souvik2
	{
		@RequestMapping("/test2")
		public String hello()
		{
			return "Hello SouvikDas !How r u?";
		}
	}

	public static void main(String[] args)
	{
		SpringApplication.run(CoreApplication.class, args);
	}

}
