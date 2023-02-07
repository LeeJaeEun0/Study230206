package Ch03_Operator;

public class Ex16_Logical_Negation_Operator {

	public static void main(String[] args) {
		// 피연산자가 true => false, false => true
		// 계속 누르면 참과 거짓을 반복 -> 토글버튼(toggle button) 구현 가능
		boolean b = true;
		char ch = 'C';
		
		System.out.println("토글처럼 true와 false를 반복함");
		System.out.printf("b=%b%n",b);
		System.out.printf("!b=%b%n",!b);
		System.out.printf("!!b=%b%n",!!b);
		System.out.printf("!!!b=%b%n",!!!b);
		System.out.println();
		
		System.out.println("대문자 C라서 소문자 비교 연산 결과는 false!");
		System.out.printf("ch=%c%n", ch);
		System.out.printf("ch < 'a' || ch > 'z' = %b%n", ch < 'a' || ch > 'z');
		System.out.printf("!('a' <= ch && ch <= 'z') = %b%n", !('a' <= ch && ch <= 'z'));
		System.out.printf(" 'a' <= ch && ch <= 'z' = %b%n", 'a' <= ch && ch <= 'z');

	}// end of main

} // end of class
