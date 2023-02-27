package Ch06_Object_oriented_Programming;

class Data3 {
	int x;
}

public class Ex6_8_Reference_Return_Type {

	public static void main(String[] args) {
		Data3 d = new Data3();
		d.x = 10;

		Data3 d2 = copy(d); // 참조형 매개변수
		System.out.println("d.x = " + d.x);
		System.out.println("d2.x = " + d2.x);
	} // end of main

	static Data3 copy(Data3 d) { // 참조형 매개변수
		Data3 tmp = new Data3();
		tmp.x = d.x;
		return tmp;
	} // end of change()
} // end of class