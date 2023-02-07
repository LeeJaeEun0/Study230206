package Ch02_Variable;
import java.util.Scanner;

public class Ex14_Scanner03_nextFloat {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // Scanner 객체를 생성
		
		System.out.print("정수를 입력하세요(형변환x): ");
		float input = scanner.nextFloat(); 

		System.out.println("입력한 숫자는 :"+input);
		System.out.printf("%f%n", input);

	} // end of main

} // end of class
