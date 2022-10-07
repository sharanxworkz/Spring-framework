package com.xworkz.volleyball;

import java.util.Scanner;

public class helo {
	

	public static void main(String[] args) {
		
			int percentage = 60;
			
			if(percentage <= 40 ) {
				System.out.println("Your Grade is D");
			}
			else if(percentage >40 || percentage <=60) {
				System.out.println("Your Grade is B");
			}
			else if(percentage >80 || percentage <= 90) {
				System.out.println("Your Grade is B+");
			}
			else if(percentage > 90) {
				System.out.println("Your Grade is A");
			}
	}

}
