package Ch02_Variable;

public class Ex07_Literal_char_String {

	public static void main(String[] args) {
		char ch = 'J'; // 하나의 문자열만 저장할 수 있음 => ab, abc 등 저장 불가
		String name = "Java"; // 여러개의 문자열을 저장하고 싶을때 사용
		
		String str ="";
		//char ch1 = ''; // 에러발생 ''안에 반드시 하나의 문자가 필요
		char ch2 = ' ';		
		
		// 둘의 차이점은 9장에서
		String name1 = new String("Java"); // String객체를 생성
		String name2 = "Java"; // name에 문자열을 저장

	} // end of main

} // end of class
