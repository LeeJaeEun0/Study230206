package Ch03_Operator;
import java.util.Scanner;

public class Ex15_Logical_Operator02 {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		char ch = ' ';
		
		// 4. 문자 ch는 숫자 0~9 (유니코드)
		// 5. 문자 ch는 대문자 또는 소문자 (유니코드)
		System.out.printf("하나의 문자를 입력하세요: ");
		
		String input = scanner.nextLine();
		ch = input.charAt(0); // 문자열에서 문자의 인덱스지정 -> 문자열에서 문자형을 사용할 수 있는 이유
		
		if('0' <= ch && ch <= '9') {
			System.out.printf("입력하신 문자는 숫자 입니다.%n");
		}
		if(('a' <= ch && ch<='z')|| ('A' <= ch && ch<='Z')) {
			System.out.printf("입력하신 문자는 영문자입니다.%n");
		}
		
	} // end of main

} // end of class
