package defaultexception;

public class DefaultException2 {
	public static void main(String[] args) {
		dostuff();
	}

	private static void dostuff() {
		doMoreStuff();
		
	}
	private static void doMoreStuff() {
		System.out.println("hello");
	}

}
