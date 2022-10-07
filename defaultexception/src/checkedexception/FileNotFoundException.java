package checkedexception;

import java.io.PrintWriter;

public class FileNotFoundException {
	public static void main(String[] args) {
		PrintWriter pw =new PrintWriter("abc.txt");
		pw.println("hello");
	}

}
