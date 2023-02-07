package Ch03_Operator;

public class Ex03_Operator_Priority {

	public static void main(String[] args) {
		int x = 100;
		int y = 100;
		
		// 단항 연산자의 우선순위가 이항 연산자의 우선순위보다 높다
		System.out.println(-x+3); //-x에서 -는 부호를 의미
		
		// 곱셈과 나눗셈의 우선순위가 덧셈과 뺄셈의 우선순위보다 높다
		System.out.println(x + 3 * y);
		
		// 비교 연산자보다 산수 연산자의 우선순위가 높다
		System.out.println(x > 300 && x < 500); // &&는 and연산자

		// 대입 연산자는 연산자 중에서 우선순위가 가장 낮다 => 그래야 모든 연산의 결과를 담음
		int result = x +3 * 3; 
		System.out.println(result);
	} // end of main

} // end of class
