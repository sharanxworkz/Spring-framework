package com.xworkz.abstarct;

public class Runner {
	public static void main(String[] args) {
		AbstractDemo bus = new Bus();
		
		int method = bus.method();
		
		System.out.println(method);
	}

}
