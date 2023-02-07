package Ch03_Operator;

public class Ex10_Arithmetic_Operation04 {

	public static void main(String[] args) {
		long a = 1_000_000 * 1_000_000;
		long b = 1_000_000 * 1_000_000L;
		
		System.out.println("a="+a); // 결과 값이 int형보다 커서 오버플로우 발생
		System.out.println("b="+b);
	} // end of main

} // end of class
