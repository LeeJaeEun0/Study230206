package Ch04_Conditionals_Iterations;

public class Ex15_Overlap_For02 {

	public static void main(String[] args) {
		// 삼각형 모양의 별을 출력
		for(int i=1; i<=5; i++) {
			for(int j=1; j <=i; j++ ) {
				System.out.print("*");
			}// end of for j
			System.out.println();
		} //end of for i

	}// end of main

} // end of class
