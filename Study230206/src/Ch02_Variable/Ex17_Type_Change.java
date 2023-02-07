package Ch02_Variable;

public class Ex17_Type_Change {

	public static void main(String[] args) {
		String str = "3";
		
		// 1. 숫자를 문자로 변환 - 숫자에 '0'을 더한다
		System.out.println((char)(3+'0'));
		
		// 2. 문자를 숫자로 변환 - 문자에서 '0'ㅇ을 뺀다
		System.out.println('3' - '0' + 1);
		
		// 3. 숫자를 문자열로 변환 - 숫자에 빈 문자열""을 더한다
		System.out.println("3"+1);
		System.out.println(""+1);
		
		// 4. 문자열을 숫자로 변환 - Integer.parseInt() 또는 Double.parseDouble90을 사용
		System.out.println(Integer.parseInt("3")+1);
		
		// 5. 문자열을 문자로 변환 - charAt(0)을 사용
		System.out.println(str.charAt(0) - '0');
		
		// 6. 문자를 문자열로 변환 - 빈 문자열 ""을 더한다
		System.out.println('3'+"");
	} // end of main

} // end of class
