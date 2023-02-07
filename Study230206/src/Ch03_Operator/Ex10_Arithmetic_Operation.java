package Ch03_Operator;

public class Ex10_Arithmetic_Operation {

	public static void main(String[] args) {
		// 이항 연산자는 형(type)이 일치해야 연산가능 => 미리 형을 일치 시키는 과정이 필요
		// 자동으로 형 변환되는 것을 산술변환, 일반 산술변환이라고 함
		
		// 1. 두 피연산자의 타입을 같게 일치 시킨다.(보다 큰 타입으로 일치) - 값의 손실 최소화
		// long + int => long + long = 1ong
		// float + int => float + float = float
		// double + float => double + double = double
		long a = 100l;
		int b = 100;
		long c = a+b;
		
		
		// 2. 피연산자의 타입이 int보다 작은 타입이면 int로 변환된다 - 너무 작은 형이면 오버플로우 가능성
		// byte + short => int + int = int
		// char + short => int + int = int
		
	} // end of main

} // end of class
