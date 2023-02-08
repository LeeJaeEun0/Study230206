package Ch04_Conditionals_Iterations;

public class Ex20_Break {

	public static void main(String[] args) {
		//break는 가장 가까운 반복문을 벗어남
		int sum =0;
		int i = 0;
		
		while(true) { // while은 무한 루프
			if(sum > 100) // sum의 값이 100을 넘기면 종료하는 조건
				break;
			++i;
			sum+=i;
			// end of if
		}// end of while

		System.out.println("i="+i);
		System.out.println("sum="+sum);
	} // end of main

} // end of class
