package equalsmethod;

public class EqualMethodDemo {
	String name;
	int rollno;

	public EqualMethodDemo(String name, int rollno) {
		this.name = name;
		this.rollno = rollno;

	}
	public boolean  equals(Object obj) {
		String name1=this.name;
		int rollno1=this.rollno;
		EqualMethodDemo e = (EqualMethodDemo)obj;
		String name2=e.name;
		int rollno2=e.rollno;
		if (name1.equals(name2) && rollno1==(rollno2)) {
			return true;
			
		} else {
			return false;

		}
		
		
	
	}

	public static void main(String[] args) {
		EqualMethodDemo equalMethodDemo1 = new EqualMethodDemo("sharan", 101);
		EqualMethodDemo equalMethodDemo2 = new EqualMethodDemo("amana", 102);

		EqualMethodDemo equalMethodDemo3 = new EqualMethodDemo("sharan", 101);

		EqualMethodDemo equalMethodDemo4 = equalMethodDemo1;
		System.out.println(equalMethodDemo1.equals(equalMethodDemo2));
		System.out.println(equalMethodDemo1.equals(equalMethodDemo3));
		System.out.println(equalMethodDemo1.equals(equalMethodDemo4));

	}

}
