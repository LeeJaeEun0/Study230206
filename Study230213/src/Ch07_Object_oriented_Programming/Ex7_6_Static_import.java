package Ch07_Object_oriented_Programming;

import static java.lang.System.out;
import static java.lang.Math.*; // Math의 모든 메서드 사용가능

public class Ex7_6_Static_import {

	public static void main(String[] args) {
		//static import문을 사용
		// 코드가 짧아짐 -> 꼭 필요한 경우에 사용하기 
		System.out.println(Math.random());
		out.println(random());
		System.out.println();
		out.println();
		
		System.out.println("Math.PI"+Math.PI);
		System.out.println("Math.PI"+PI);
		
	} // end of main

} // end of class
