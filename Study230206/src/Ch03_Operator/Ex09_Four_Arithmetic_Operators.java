package Ch03_Operator;

public class Ex09_Four_Arithmetic_Operators {

	public static void main(String[] args) {
		int a = 10;
		int b = 4;
		
		// 더하기 연산
		System.out.printf("%d + %d = %d%n",a,b,a+b);
		// 빼기 연산
		System.out.printf("%d - %d = %d%n",a,b,a-b);
		// 곱하기 연산
		System.out.printf("%d * %d = %d%n",a,b,a*b);
		// 나누기 연산
		// a,b가 정수형으로 결과도 정수형
		System.out.printf("%d / %d = %d%n",a,b,a/b); 
		// 한쪽이 실수형이면 모두 실수형으로 바꿔서 연산
		System.out.printf("%d / %f = %f%n",a,(float)b,a/(float)b);
	} // end of main

} // end of class
