package Ch03_Operator;

public class Ex08_Auto_Casting {

	public static void main(String[] args) {
		// 편의상의 이유로 형 변환을 생략할 수 있음 => 컴파일러가 자동으로 형변환
		
		float f =1234; // (float)1234에서 (float)을 쓰지 않아도 자동으로 형변환

		// Unresolved compilation problem: 
		// Type mismatch: cannot convert from int to byte
		// 큰 타입에서 작은 타입으로 형변환을 했을 경우 값의 손실될 가능성이 있음
		//byte b = 1000; // byte의 범위는 (-128 ~ 127)인데 1000은 값의 범위를 초과

		// 값의 손실이 있지만 강제적으로 형변환을 함
		byte b = (byte)1000;
		
		// 자동 형변환은 기존의 값을 최대한 보존할 수있는 타입으로 자동 형변환
	} // end of main

} // end of class
