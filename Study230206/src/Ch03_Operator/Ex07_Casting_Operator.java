package Ch03_Operator;

public class Ex07_Casting_Operator {

	public static void main(String[] args) {
		// 서로 다른 타입의 연산을 할때 타입을 일치시키기 위해 형변환(casting) 필요
		// 형변환은 변수 또는 상수의 타입을 다른 타입으로 변환하는 것
		
		// 1. 정수를 문자형으로
		int a = 65; // 형변환하고 피연산자의 값은 변하지 않음 => 다른 변수에 형 변환한 값을 저장해서
		char b = (char)a;
		System.out.printf("정수형 %d를 문자형 %c로 바꾸기 성공!\n", a,b);
		
		// 2. 문자형을 정수형으로
		char c= 'A';
		int d = (int)c;
		System.out.printf("%c를 정수형 %d로 바꾸기 성공!\n", c,d);
		
		// 3. 실수형을 정수형으로
		float e = 1.6f;
		int f = (int)e;
		System.out.printf("%f를 정수형 %d로 바꾸기 성공!\n",e,f);
		
		// 4. 정수형을 실수형으로
		int g = 10;
		float h = (float)g;
		System.out.printf("%d를 실수형 %f로 바꾸기 성공!\n",g,h);
		
	} // end of main

} // end of class
