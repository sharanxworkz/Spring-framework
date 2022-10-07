package com.xworkz.collections;

import java.util.ArrayList;

public class ArrayListPractise {
	public static void main(String[] args) {
//		String[] student = new String[30];
//		student[0]="sharan";
//		student[31]="sharan";
//		System.out.println(student[0]);
		
		ArrayList<Integer> student=new ArrayList<>();
		student.add(1);
		student.add(2);
		System.out.println(student);
		
		student.add(1, 50);
		System.out.println(student);

		
	}

}
