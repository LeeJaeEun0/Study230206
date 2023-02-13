package Ch07_Object_oriented_Programming;

class MyPoint3_2 extends Object{ // extends Object 생략가능
	int x;
	int y;
	
	MyPoint3_2(){}
	
	MyPoint3_2(int x, int y) {
		this.x=x;
		this.y=y;
	} // end of MyPoint()

	// Object 클래스의 toString()을 오버라이딩
	public String toString() {
		return "x:"+x+", y:"+y;
	} // end of toString()
} // end of class

public class OverridingTest_2 {

	public static void main(String[] args) {
		MyPoint3_2 p = new MyPoint3_2();
		p.x =3;
		p.y = 5;
		
		// p 객체의 x,y를 출력
		System.out.println("객체의 x,y를 출력");
		System.out.println(p.x);
		System.out.println(p.y);
		System.out.println();
		
		// 오버라이딩한 메소드 사용
		System.out.println("toString() 메소드 오버라이딩");
		System.out.println(p.toString());
		System.out.println(p);
		System.out.println();
		
		// 생성자 초기화와 메소드 오버라이딩 사용
		MyPoint3_2 p2 = new MyPoint3_2(3,5);
		System.out.println(p2);
	} // end of main

} // end of class
