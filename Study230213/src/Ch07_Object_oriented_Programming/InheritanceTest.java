package Ch07_Object_oriented_Programming;

class MyPoint{
	int x;
	int y;
} // end of class

//상속
class Circle extends MyPoint{
	int r;
} // end of class

// 포함
class Circle2  {
	MyPoint p = new MyPoint();
	int r;
} // end of class

// 단일 상속
class Circle3 extends Object{
	MyPoint p; // new MyPoint;
	int r;
	 
	Circle3(){ // 생성자로 객체 생성하기
		p = new MyPoint();
	} // end of Circle
}// end of class

public class InheritanceTest {

	public static void main(String[] args) {
		// 1. 상속하는 경우
		Circle c = new Circle();
		c.x =1;
		c.y =2;
		c.r=3;
		System.out.println("c.x = "+c.x);
		System.out.println("c.y = "+c.y);
		System.out.println("c.r = "+c.r);
		System.out.println();
		
		// 2. 포함하는 경우
		Circle2 c2 = new Circle2();
		c2.p.x =1;
		c2.p.y =2;
		c2.r=3;
		System.out.println("c2.p.x = "+c2.p.x);
		System.out.println("c2.p.y = "+c2.p.y);
		System.out.println("c2.r = "+c2.r);
		System.out.println();
		
		// 3. 단일 상속하는 경우
		Circle3 c3 = new Circle3();
		// toString()은 문자열을 반환
		System.out.println(c3.toString()); // object를 상속받아서 사용가능
		System.out.println(c3);
		System.out.println();
		// 객체별 다른 값을 출력
		Circle3 c4 = new Circle3();
		// toString()은 문자열을 반환
		System.out.println(c4.toString()); // object를 상속받아서 사용가능
		System.out.println(c4);
	} // end of main

} // end of class
