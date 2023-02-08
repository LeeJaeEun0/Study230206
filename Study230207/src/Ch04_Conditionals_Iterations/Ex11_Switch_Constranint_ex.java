package Ch04_Conditionals_Iterations;
import java.util.Scanner;
public class Ex11_Switch_Constranint_ex {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("현재 월을 입력하세요> ");
		int month = scanner.nextInt(); // 화면을 통해 입력받은 숫자를 month에 저장
		
		switch(month) {
			case 3:
			case 4:
			case 5:
				System.out.println("현재의 계절은 봄 입니다.");
				break;
			case 6: case 7:	case 8:
				System.out.println("현재의 계절은 여름 입니다.");
				break;
			case 9: case 10:	case 11:
				System.out.println("현재의 계절은 가을 입니다.");
				break;
			case 12: case 1:	case 2:
				System.out.println("현재의 계절은 겨울 입니다.");
				break;
			default:// 조건식과 일치하는 것이 없는 경우
				System.out.println("현재 계절은 겨울 입니다.");
		}// end of switch

	} // end of main

} // end of class
