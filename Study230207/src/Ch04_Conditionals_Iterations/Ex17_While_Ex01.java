package Ch04_Conditionals_Iterations;

public class Ex17_While_Ex01 {

	public static void main(String[] args) {
		int i =5;
		
		while(i-- != 0) { // 조건식은 i가 0이 아닌 경우 수행 // 조건식 판별 후 뺄셈 진행
			System.out.println(i+ "- I can do it");
		} // end of while i
		System.out.println();
		i=5;
		// 위와 동일한 코드
		while(i != 0) { // 조건식은 i가 0이 아닌 경우 수행 // 조건식 판별 후 뺄셈 진행
			i--;
			System.out.println(i+ "- I can do it");
		} // end of while i
	} // end of main

} // end of class
