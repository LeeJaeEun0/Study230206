package Ch03_Operator;

public class Ex01_Operator_Operand {

	public static void main(String[] args) {
		// 연산자는 연산을 수행하는 기호
		// 연산의 대상은 피연산자(operand)
		
		int x = 5;
		
		// 결과를 다른 연산에 사용한다면 변수에 결과를 넣기
		int total=4 * x + 3; // 연산자 2개, 피연산자 3개로 구성
		
		System.out.println(total);

		// 결과만 출력해서 보고 싶을때는 print사용하기
		System.out.println(4*5+3);
		
	} // end of main

} // end of class
