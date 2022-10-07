package com.xworkz.pen;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PenRunner {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ggd.xml");
		Pen pen = context.getBean(Pen.class);
		System.out.println(pen);
	}

}
