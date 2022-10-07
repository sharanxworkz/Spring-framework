package com.durgasoft.durgagodfather;

import java.util.ArrayList;

public class GanapathiBappa {
	String name;
	int rollno;

	public GanapathiBappa(String name, int rollno) {

		this.name = name;
		this.rollno = rollno;
	}

	public static void main(String[] args) {
		GanapathiBappa s = new GanapathiBappa("sharan", 7);
		GanapathiBappa s1 = new GanapathiBappa("sharan", 7);
		String g = new String("amana");
		System.out.println(g);
		System.out.println(s);
		ArrayList l = new ArrayList();
		l.add("a");
		l.add("b");
		System.out.println(l);

	}

}