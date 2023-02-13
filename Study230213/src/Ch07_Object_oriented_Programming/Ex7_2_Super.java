package Ch07_Object_oriented_Programming;

public class Ex7_2_Super {

	public static void main(String[] args) {
		Child c = new Child();
		c.method();

	} // end of main

} // end of class

class Parent {int x =10; /* super.x */}

class Child extends Parent{
	int x = 20;
	void method() {
		System.out.println("x="+x);
		System.out.println("this.x = "+this.x);
		System.out.println("super.x = "+super.x); 
		
	} // end of method()
} // end of class