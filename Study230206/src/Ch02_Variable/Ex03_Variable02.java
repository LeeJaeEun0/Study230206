package Ch02_Variable;

public class Ex03_Variable02 {

	public static void main(String[] args) {
		System.out.println("변수를 사용하지 않은 경우");
		// 다른 숫자로 넣고 싶을때는 일일이 바꿔줘야 함
		System.out.println(10+5);
		System.out.println(10-5);
		System.out.println(10*5);
		System.out.println(10/5);
		System.out.println();
		
		System.out.println("변수를 사용한 경우");
		//숫자를 바꾸고 싶을 때는 변수에 다른 값을 저장하기
		
		int x = 10;
		int y = 5;
		
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x/y);

	} // end of main

} // end of class
