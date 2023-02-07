package Ch02_Variable;

public class Ex12_Printf {

	public static void main(String[] args) {
		// println은 변수의 내용을 그대로 출력 - 소수점 자릿수 등 변화를 주고 싶을때 printf 사용
		int age = 14;
		int year = 2019;
		
		// 지시자(specifier)를 통해 변수의 값을 어떤 형식으로 출력할지를 지정할 수 있음
		System.out.printf("age:%d\n", age); // \n을 통해서 줄바꿈을 할 수 있음
		System.out.printf("age:%d%n",14);   // os마다 줄바꿈 문자가 다를 수 있어서 사용
		System.out.printf("age:14");
		System.out.println();
		System.out.printf("age: %d, year: %d", age, year);
		System.out.printf("age: %d, year: %d", 14, 2019);
	} // end of main

} // end of class
