package Ch07_Object_oriented_Programming;

public class Ex7_3_Super2 {

	public static void main(String[] args) {
		Child2 c = new Child2();
		c.method();

	} // end of main

} // end of class

class Parent2{int x=10; /*super.x와 this.x 둘다 가능*/}

class Child2 extends Parent2{
	void method() {
		System.out.println("x="+x);
		System.out.println("this.x="+this.x);
		System.out.println("super.x="+super.x);
	} // end of method()
} // end of class