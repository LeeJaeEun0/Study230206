package Ch02_Variable;
import java.util.Scanner;

public class Ex14_Scanner02_nextInt {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); // Scanner 객체를 생성
		
		System.out.print("정수를 입력하세요(형변환x): ");
		int input = scanner.nextInt(); 

		System.out.println("입력한 숫자는 :"+input);
		System.out.printf("%d%n", input);

	} // end of main

} // end of class
