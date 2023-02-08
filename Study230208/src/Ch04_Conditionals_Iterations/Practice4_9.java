package Ch04_Conditionals_Iterations;

public class Practice4_9 {

	public static void main(String[] args) {
		// 각 자리의 합을 더한 결과를 출력하는 코드를 넣으시오
		int num=12345;
		int sum=0;
		
		// 알맞은 코드를 넣어 완성하시오
		for(int i=0; i<= 5; i++) {
			if(num%10!= 0) {
				sum += num% 10;
				num = num/10;
			} // end of if
			
		} // end of for i
		
		System.out.println("sum은 "+sum);

	} // end of main

} // end of class
