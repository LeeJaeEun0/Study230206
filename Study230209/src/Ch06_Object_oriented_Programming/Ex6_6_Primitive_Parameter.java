package Ch06_Object_oriented_Programming;

class Data {int x;}

public class Ex6_6_Primitive_Parameter {

	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("main(): x = "+ d.x); // 읽기만 가능
		
		change(d.x);
		System.out.println("After change(d.x)");
		System.out.println("main(): x = "+ d.x); // 참조하고 있는 객체의 값
	} // end of main

	private static void change(int x) {
		x =1000;
		System.out.println("change() : x = "+x);
		
	} // end of change()

}	// end of class
 
