package com.xworkz.chair;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ChairRunner {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("sha.xml");
		System.out.println("bean created");
		Chair chair = context.getBean(Chair.class);
		System.out.println(chair);
		
		Stand stand = context.getBean(Stand.class);
		System.out.println(stand);
		
	}

}
