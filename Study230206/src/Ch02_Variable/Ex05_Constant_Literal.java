package Ch02_Variable;

public class Ex05_Constant_Literal {

	public static void main(String[] args) {
		// 상수는 값을 저장할 수 있는 공간이지만 값을 한 번 저장하면 변경할 수 없다!
		// 변수명 앞에 final을 붙이면 상수가 된다
		final int MAX_VALUE; // 상수 선언
		MAX_VALUE = 100; // 상수에 값을 저장
		//MAX_VALUE=200; // 상수에 값을 저장 할 수 없다는 에러 발생
	} // end of main

} // end of class
