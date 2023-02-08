package Ch04_Conditionals_Iterations;

public class Practice4_5_after {

	public static void main(String[] args) {
		int i=0, j=0;
		
		while(i<=10) {
			j=0; // j 초기화하는 부분 주의
			while (j <= i) {
				System.out.print("*");
				j++;
			}// end of while j
			System.out.println();
			i++;
		}// end of while i

	} // end of main

} // end of class
