package airthmeticexception;

public class Arithmetic {
	public static void main(String[] args) {
		System.out.println("statement 1");
		try {
		System.out.println(10/0);
		}
		catch(ArithmeticException e) {
//			 
			System.out.println(10/2);
		}
		
		System.out.println("statement 2 ");
	}

}
