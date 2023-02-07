package Ch03_Operator;

public class Ex14_Comparison_String02 {

	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = new String("abc");
		
		// print문에서 "를 출력하기 위해서 \"을 사용
		System.out.println("문자열 비교하기");
		System.out.printf(" \"abc\" == \"abc\" ? %b%n", "abc"=="abc");
		System.out.println();
		
		System.out.println("문자열끼리만 비교 가능, 객체와 문자열을 비교할 수 없음");
		System.out.printf(" str1 == \"abc\" ? %b%n", str1=="abc");
		System.out.printf(" str2 == \"abc\" ? %b%n", str2 =="abc"); // 같은 내용이지만 서로다른 객체라서 false
		System.out.println();
		
		System.out.println("대소문자 구별해서 비교");
		System.out.printf(" str1.equals(\"abc\") ? %b%n", str1.equals("abc"));
		System.out.printf(" str2.equals(\"abc\") ? %b%n", str2.equals("abc"));
		System.out.printf(" str1.equals(\"ABC\") ? %b%n", str1.equals("ABC"));
		System.out.printf(" str1.equals(\"ABC\") ? %b%n", str2.equals("ABC"));
		System.out.println();
		
		System.out.println("대소문자 구분하지 않고 비교");
		System.out.printf(" str1.equalsoIngnoreCase(\"ABC\") ? %b%n", str1.equalsIgnoreCase("ABC"));
		System.out.printf(" str1.equalsoIngnoreCase(\"abc\") ? %b%n", str1.equalsIgnoreCase("abc"));
	} // end of main

} // end of class
