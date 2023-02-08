package Ch04_Conditionals_Iterations;

public class Ex02_if_ex01 {

	public static void main(String[] args) {
		// if문의 조건자리에 다양한 조건이 들어갈 수 있다.
		
		int x = 0;
		System.out.printf("x가 %d 일때, 참인 경우는 %n", x);
		
		if(x==0) System.out.println("x==0"); // 예측, x는 0이라서
		if(x!=0) System.out.println("x!=0");
		if(!(x==0)) System.out.println("!(x==0)");
		if(!(x!=0)) System.out.println("!(x!=0)"); // 예측, x가 0과 '같지 않다'를 부정 => x==0
		System.out.println();
		
		x=1;
		System.out.printf("x가 %d 일때, 참인 경우는 %n", x);
		if(x==0) System.out.println("x==0");
		if(x!=0) System.out.println("x!=0");// 예측, x는 1일이서
		if(!(x==0)) System.out.println("!(x==0)");// 예측, x는 0과 '같다'를 부정 => x !=0 
		if(!(x!=0)) System.out.println("!(x!=0)");		

	} // end of main

} // end of class
