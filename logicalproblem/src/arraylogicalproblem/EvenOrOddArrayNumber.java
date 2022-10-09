package arraylogicalproblem;

public class EvenOrOddArrayNumber {
	public static void main(String[] args) {
		
		int[] a= {1,2,3,4,5,6,7};
		
//		even number
		
//		for(int i=0;i<a.length;i++) {
//			if(a[i]%2==0) {
//				System.out.println("It is even number"+a[i]);
//			}
//		}
		
//		
//		for(int i=0;i<a.length;i++) {
//			if(a[i]%2!=0) {
//				System.out.println("It is odd number"+a[i]);
//			}
//		}
		
		
		for(int even:a) {
			if(even%2==0) {
				System.out.println(even); 		
			}
		}

	}

}
