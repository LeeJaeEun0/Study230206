package Ch04_Conditionals_Iterations;

public class Ex13_For {

	public static void main(String[] args) {
		// 반복문: 작업이 반복적으로 수행시 사용, for문, while문, do~while문
		//for (초기화;조건식;증감식)
		// 초기화: 반복문에서 사용될 변수를 초기화 하는 부분, 한 번만 수행 (같은 타입의 경우 여러개 같이 선언가능)
		// 조건식: 조건식이 참인 경우에 반복을 계속하고 거짓이면 반복 중단 함
		// 증감식: 반복문을 제어하는 변수의 값을 증가 또는 감소 시키는 식
		// for(::) // 무한 루프
		for(int i=1; i<=5; i++) { // 1부터 5까지 5번 반복
			System.out.println("I can do it."); // 조건식이 참인 동안에 수행
		} // end of for i

	} // end of main

} // end of class
