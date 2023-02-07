package Ch03_Operator;

public class Ex10_Arithmetic_Operation02 {

	public static void main(String[] args) {
		byte a =10;
		byte b = 30;
		
		//byte c= a+b; // int 형을 byte형으로 넣으려고 해서 오류 발생
		byte c= (byte)(a * b); // 자료가 손실될 가능성이 있지만 강제로 형변환
		// Unresolved compilation problem: 
		// Type mismatch: cannot convert from int to byte
		System.out.println(c); // 10 * 30 = 300이지만 형 변환을 하면서 값의 손실발생 
		// 256 + 32 + 8 + 4 해서 300이지만 byte 특성상 8개의 비트 => 128까지만 표현 할 수 있음
		// 따라서 32 + 8 + 4 = 44로 결과가 나타남

	} // end of main

}// end of class
