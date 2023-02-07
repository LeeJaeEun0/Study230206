package Ch03_Operator;

public class Ex10_Arithmetic_Operation01 {

	public static void main(String[] args) {
		// 정수 나누기 정수의 결과는 정수
		System.out.println(5/2);
		// 실수의 결과를 얻고 싶으면 한쪽의 값을 실수형으로 하면 됨
		System.out.println(5/(float)2);
		System.out.println((float)5/2); // 어느 쪽이 실수이던지 상관 없음
		System.out.println((float)5/(float)2);
	} // end of main

} // end of class
