package Ch03_Operator;

public class Ex11_Math_round {

	public static void main(String[] args) {
		// 반올림을 하기 위해 round() 함수 사용
		double pi = 3.141592;
		// round 함수에서 매개변수로 받은 값의 소수점 첫번째 자리에서 반올림
		// 1. round 함수에서 원하는 숫자를 반올림하기 위해서 *1000을 함
		// 2. 원하는 자리에서 반올림을 하고 다시 곱한만큼 나누기해서 되돌림
		// * 나누기를 할때 정수 / 정수의 결과는 정수 임으로 실수로 나누기를 진행
		double shortPi = Math.round(pi*1000)/1000.0;
		System.out.println(Math.round(pi*1000));
		System.out.println(shortPi);
	} // end of main

} // end of class
