package com.xworkz.practise;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PractiseRunner {
	public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("sharan.xml");
	Practise practise = context.getBean(Practise.class);
	System.out.println(practise);
	
	}

}
