package Ch06_Object_oriented_Programming;

class Data_1{
	int value;
} // end of class

class Data_2{
	int value;
	Data_2(int x){ // 매개변수가 있는 생성자
		value = x;
	} // end of data2
} // end of class

public class Ex6_11_Defult_Constructor {

	public static void main(String[] args) {
		Data_1 d1 = new Data_1();
		Data_2 d2 = new Data_2();

	} // end of main

} // end of class
