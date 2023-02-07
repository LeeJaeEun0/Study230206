package Ch02_Variable;

import java.util.Scanner; // Scanner을 사용하기 위해 추가

public class Ex14_Scanner01_nextLine {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // Scanner 객체를 생성
		
		System.out.print("정수를 입력하세요(형변환o): ");
		String input = scanner.nextLine(); // 입력 받은 내용을 input에 저장
		int num = Integer.parseInt(input); // 문자형태인 input을 int로 형변환

		System.out.println("입력한 숫자는 :"+input);
		System.out.printf("num = %d%n", num);
		
		
	} // end of main

} // end of class
