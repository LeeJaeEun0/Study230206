package Ch04_Conditionals_Iterations;

public class Practice4_3 {

	public static void main(String[] args) {
		// 1+ (1+2)+ ...+ (1+2+...+10)
		int sum =0;
		for (int i=1; i<=10; i++) {
			for(int j=1;j<=i;j++)
				sum+=j;
		}// end of for i
		System.out.println("1+ (1+2)+ ...+ (1+2+...+10)의 결과는 "+sum);
	} // end of main

} // end of class
