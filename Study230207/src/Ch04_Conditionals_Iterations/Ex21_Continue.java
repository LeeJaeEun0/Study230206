package Ch04_Conditionals_Iterations;

public class Ex21_Continue {

	public static void main(String[] args) {
		// continue는 반복을 수행하는 도중에 멈추고 반복문 시작 지점으로 이동
		for(int i=0; i<=10; i++) {
			if(i%3==0)//  3의 배수인 경우
				continue;
			System.out.println(i);
		} // end of for i

	}// end of main

} // end of class
