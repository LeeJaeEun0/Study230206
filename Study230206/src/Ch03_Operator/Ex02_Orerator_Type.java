package Ch03_Operator;

public class Ex02_Orerator_Type {

	public static void main(String[] args) {
		int x = 0;
		// 단항 연산자 - 피연산자의 수가 1개
		// ex) ++x, x++, --x, --y
		System.out.printf("1. x++ = %d\n",x++);
		System.out.printf("2. x = %d\n",x);
		System.out.println();
		
		//이항 연산자 - 피연산자의 수가 2개
		// 산술 연산자, 비교 연산자, 논리 연산자
		int sum = 1+1;
		System.out.println("1 + 1 = "+sum);
		System.out.println();
		
		// 삼항 연산자 - 피연산자의 수가 3개
		int max = (3> 4)? 1:0;
		System.out.println(max);

	} // end of main

} // end of class