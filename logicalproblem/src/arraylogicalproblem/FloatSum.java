package arraylogicalproblem;

public class FloatSum {
	public static void main(String[] args) {
		int[] sum= {10,20,30,45,50};
		int summ=0;

		for(int i=0;i<sum.length;i++) {
			summ=summ+sum[i];
		}
		System.out.println(summ);
	}



}
