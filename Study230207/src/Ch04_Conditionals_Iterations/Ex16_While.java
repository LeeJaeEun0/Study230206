package Ch04_Conditionals_Iterations;

public class Ex16_While {

	public static void main(String[] args) {
		// while문은 조건식과 블럭으로 구성
		int i=1;
		while(i<10) { // 조건식
			System.out.println(i);
			i++; // 증감식을 넣지 않으면 무한루프 돌 수 있음
		}// end of while

	} // end of main

} // end of class
