package com.xworkz.dasaraaa.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.xworkz")
public class SpringConfiguration {
	
	public SpringConfiguration() {
		System.out.println("running SpringConfiguration"+this.getClass().getSimpleName());
	}

}

