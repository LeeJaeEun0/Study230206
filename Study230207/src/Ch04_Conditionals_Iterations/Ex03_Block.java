package Ch04_Conditionals_Iterations;

public class Ex03_Block {

	public static void main(String[] args) {
		// {}에서 여러문장을 하나의 문장로 묶을 수 있다
		// 한줄의 경우 {}를 생략할 수 있다.
		
		int score = 0;
		
		if(score > 60) {
			System.out.println("합격 입니다! 축하드립니다!");
		}// end of if
		
		if(score > 60) 
		{
			System.out.println("합격 입니다! 축하드립니다!");
		} // end of if
		
		if(score > 60) System.out.println("합격 입니다! 축하드립니다!");
		
		if(score > 60) 
			System.out.println("합격 입니다! 축하드립니다!");
			System.out.println("여기는 if문과 상관없이 실행");

	} // end of main

} // end of class
