package Ch02_Variable;

public class Ex13_Printf_Ex {

	public static void main(String[] args) {
		String url ="www.codechobo.com";
		float f1 = .10f;
		float f2 = 1e1f;
		float f3 = 3.14e3f;
		double d = 1.23456789;
		
		System.out.println("f1, f2, f3의 값을 출력하기");
		// %f는 보통 실수를 출력, %e는 지수의 형태로 출력, %g는 간략하게 출력
		System.out.printf("f1 => %f, %e, %g%n", f1,f1,f1);
		System.out.printf("f2 => %f, %e, %g%n", f2,f2,f2);
		System.out.printf("f3 => %f, %e, %g%n", f3,f3,f3);	
		System.out.println();
		
		System.out.println("d의 값을 출력하기");
		System.out.printf("d =>  %f%n", d);		// 1.234567까지 출력되고 8의 자리수에서 반올림해서 1.234568
		System.out.printf("d => %14.10f%n", d); // 전체 14자리 중에 10자리가 소수점의 자리
		System.out.printf("d => %014.10f%n", d); // 빈자리의 수를 0으로 채움
		System.out.println();
		
		System.out.println("url의 값을 출력하기");
		System.out.printf("[12345678901234567890]%n");
		System.out.printf("[%s]%n", url); // 문자열 길이만큼 - 출력공간 확보
		System.out.printf("[%20s]%n", url); //최소 20글자 공간 확보 - 우측정렬
		System.out.printf("[%-20s]%n", url); //-는 왼쪽 정렬
		System.out.printf("[%.8s]%n",url); //왼쪽에서 8자리만 출력
		
	}// end of main

} // end of class
