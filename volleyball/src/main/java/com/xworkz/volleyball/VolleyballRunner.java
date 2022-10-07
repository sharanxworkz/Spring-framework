package com.xworkz.volleyball;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class VolleyballRunner {
	public static void main(String[] args) {
		ApplicationContext container = new ClassPathXmlApplicationContext("context.xml");
		System.out.println(container);
		Volleyball bean = container.getBean(Volleyball.class);
		System.out.println(bean);

	}
}
