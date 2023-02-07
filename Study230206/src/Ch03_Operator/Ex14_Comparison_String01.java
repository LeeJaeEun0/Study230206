package Ch03_Operator;

public class Ex14_Comparison_String01 {

	public static void main(String[] args) {
		// 문자열 비교 - equals()를 사용
		String str = new String("abc");
		
		// 두 문자열의 내용이 같으면 true, 다르면 false
		boolean result = str.equals("abc");
		
		System.out.printf("%s 와 abc 비교 결과 %b\n", str, result);
		
		String str1= new String("abc"); // String 클래스의 객체를 생성
		String str2 = "abc"; // 위의 문장을 간단히 표현
		
		
	} // end of main

} // end of class
