package Ch04_Conditionals_Iterations;
import java.util.Scanner;
public class Ex04_If_Else {

	public static void main(String[] args) {
		// if문 - 참일 경우만 실행
		// if ~ else문 참과 거짓 각각 실행하는 문장이 있음
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("숫자를 입력 하세요: ");
		int input = scanner.nextInt(); // 화면을 통해 입력받은 숫자 저장
		
		if(input==0) {
			System.out.println("입력하신 숫자는 0 입니다."); // if문 결과: true
		}else { 
			System.out.println("입력하신 숫자는 0이 아닙니다."); // if문 결과: false
		} // end of if else
		
	} // end of main

} // end of class
