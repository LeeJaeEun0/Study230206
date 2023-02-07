package Ch03_Operator;

public class Ex13_Comparison_Operator {

	public static void main(String[] args) {
		// 비교 연산자는 두 피연산자를 비교하는데 사용
		// 조건문, 반복문 등에서 사용 => 연산결과는 true 또는 false 
		int a=10, b =20;
		int c=20, d=20;
		
		// 대소 비교 연산자 - <,<=, >=, >
		// 값의 크기를 비교하는 연산자
		System.out.printf("%d > %d : %b%n", a,b, a>b); 
		System.out.printf("%d >= %d : %b%n", a,b, a>=b);
		System.out.printf("%d <= %d : %b%n", a,b, a<=b);
		System.out.printf("%d < %d : %b%n", a,b, a<b);
		System.out.println();
		// 등가 비교 연산자 - == !=
		System.out.printf("%d == %d : %b%n", c,d,c==d);
		System.out.printf("%d != %d : %b%n", c,d,c!=d);
	} // end of main

} // end of class
