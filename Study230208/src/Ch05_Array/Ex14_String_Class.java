package Ch05_Array;

public class Ex14_String_Class {

	public static void main(String[] args) {
		// String 클래스는 char 배열에 기능(메서드)을 추가한 것
		// String는 내용을 읽을 수만 있고 변경은 불가능하다
		
		String str = "Java";
		System.out.println(str);
		str = str+"8";
		System.out.println(str);

		
		String str1 = "Java";
		System.out.println(str1);
		str += "8";
		System.out.println(str1); // 8이 추가되지 않음
	} // end of main

} // end of class
