package Ch02_Variable;

public class Ex09_Swap {

	public static void main(String[] args) {
		
		int x=10, y=5;
		System.out.println("x와 y의 값을 바꾸기 - tmp 변수 사용");
		System.out.println("x="+x);
		System.out.println("y="+y);
		
		int tmp = x; // x의 값을 tmp에 저장
		x=y;		 // y의 값을 x에 저장
		y = tmp;	 // tmp의 값을 y에 저장
		System.out.println("x="+x);
		System.out.println("y="+y);

	} // end of main

} // end of class
