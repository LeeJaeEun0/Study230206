package Ch05_Array;

import java.util.Arrays;

public class Ex06_Array_Print {

	public static void main(String[] args) {
		int[] iArr = {100, 95, 80, 70, 60};
		for (int i=0; i< iArr.length; i++) {
			System.out.println(iArr[i]); // 배열요소를 하나하나 출력
		} // end of for i
		System.out.println();
		for (int i=0; i< iArr.length; i++) {
			System.out.print(iArr[i]+", "); // 배열요소를 하나하나 출력
		} // end of for i
		System.out.println();
		
		//Arrays.toString() 사용하기 - import 필요
		System.out.println(Arrays.toString(iArr)); // Arrays.toString()는 배열을 문자열로 만드는 메소드
		System.out.println(iArr);  //[I@58ceff1 같은 문자열이 출력 => 타입@주소 형식으로 저장된 내용
		System.out.println();
		
		//예외
		char[] chArr = {'a','b','c','d'};
		System.out.println(chArr);
	} // end of main

} // end of class
