package Ch06_Object_oriented_Programming;
class Data2{int x;}
public class Ex6_7_Reference_Parameter {

	public static void main(String[] args) {
		Data2 d = new Data2();
		d.x = 10;
		System.out.println("main(): x = "+ d.x); // 읽기+쓰기 가능
		
		change(d);
		System.out.println("After change(d)");
		System.out.println("main(): x = "+ d.x); // 참조하고 있는 객체의 값
	} // end of main

	static void change(Data2 d) { // 참조형 매개변수
		d.x =1000;
		System.out.println("change() : x = "+d.x);
		
	} // end of change()
} // end of class