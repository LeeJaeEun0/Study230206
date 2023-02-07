package Ch02_Variable;

public class Ex06_Literal_Type_suffix {

	public static void main(String[] args) {
		// 8진수는 앞에 0을 붙여서 표기, 16진수는 0x를 앞에 붙여서 표기 
		int octNum= 010; //8진수 10 => 10진수 8
		int hexNum= 0x10; // 16진수 10 => 10진수 16
		
		// long 뒤(접미사)에 L또는 l을 쓰지 않으면 오류 발생
		// 정수형 리터럴의 중간에 구분자로 _(언더바)를 넣을 수 있음
		long big = 100_000_000_000L;
		long hex = 0xFFFF_FFFF_FFFF_FFFFL;
		
		// float는 뒤에 f나 F를 붙임, double는 뒤에 d나 D를 붙임
		float pi = 3.14f;
		double rate = 1.618d;

	}// end of main

} // end of class
