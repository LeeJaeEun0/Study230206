package Ch04_Conditionals_Iterations;

public class Ex15_Overlap_For01 {

	public static void main(String[] args) {
		System.out.println("for문 출력");
		for(int i = 1; i<=5; i++) {
			System.out.println("**********");
		} // end of for i
		System.out.println();
		
		System.out.println("이중 for문으로 작성");
		for(int i=1; i<=5; i++) {
			for (int j=1; j<=10; j++) {
				System.out.print("*");
			}// end of for j
			System.out.println();
		}// end of for i
	} // end of main

} // end of class
