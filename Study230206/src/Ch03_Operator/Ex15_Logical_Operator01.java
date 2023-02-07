package Ch03_Operator;

public class Ex15_Logical_Operator01 {

	public static void main(String[] args) {
		// 두 개의 조건이 결합된 경우 - 논리 연산자 사용
		// && 연산자는 and를 의미하며 두개의 조건이 모두 참인 경우 true을 출력
		// || 연산자는 or을 의미하며 두개의 조건 중 하나라도 참인 경우 true을 출력
		
		//1. x는 10보다 크고, 20보다 작다
		int x = 7;
		System.out.println(x> 10 && x<20);
		
		//2.i는 2의 배수 또는 3의 배수 이다.
		int i = 9;
		System.out.println(i % 2 == 0 || i % 3 ==0);

		//3. i는 2의 배수 또는 3의 배수지만 6의배수는 아니다
		System.out.println((i%2 ==0 || i%3==0) && i % 6 != 0);
	} //end of main

} // end of class
