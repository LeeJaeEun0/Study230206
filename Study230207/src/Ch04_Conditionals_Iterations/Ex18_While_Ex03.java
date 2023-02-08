package Ch04_Conditionals_Iterations;
import java.util.Scanner;
public class Ex18_While_Ex03 {

	public static void main(String[] args) {
		// 각 자리수의 합을 구하기
		int num = 0, sum = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요(예:12345): ");
		String tmp = scanner.nextLine(); // 입력받은 내용을 tmp에 저장
		num = Integer.parseInt(tmp); // 입력받은 문자열을 숫자로 변환
		
		while(num != 0) {
			// num을 10으로 나눈 나머지를 sum에 더함
			sum += num % 10;
			System.out.printf("sum = %3d num=%3d%n", sum, num);
			num /=10; // num을 10으로 나눈 값을 다시 num에 저장
		}//end of while i
		System.out.println("각 자리수의 합 : "+sum);
	} // end of main

}// end of class
