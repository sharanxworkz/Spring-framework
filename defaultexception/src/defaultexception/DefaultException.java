package defaultexception;

public class DefaultException {
	public static void main(String[] args) {
		doStuff();
	}
	public static void doStuff() {
		doMoreStuff();
		System.out.println(10/0);
	}
	private static void doMoreStuff() {
		System.out.println("hello");
		
	}

}
