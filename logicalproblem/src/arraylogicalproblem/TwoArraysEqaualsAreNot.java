package arraylogicalproblem;

import java.util.Arrays;

public class TwoArraysEqaualsAreNot {
	public static void main(String[] args) {
		int[] a1= {1,20,30};
		int[] a2= {10,20,30};
		
		boolean equals = Arrays.equals(a1, a2);
		
if(equals==true) {
	System.out.println("arrays are equal"+equals);
}
else {
	System.out.println("arrays are not equal"+equals);
}
	

		
}
}
