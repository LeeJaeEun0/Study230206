package Ch04_Conditionals_Iterations;
import java.util.Scanner;
public class Ex11_Switch_Constranint_if {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("현재 월을 입력하세요> ");
		int month = scanner.nextInt(); // 화면을 통해 입력받은 숫자를 month에 저장
		
		if(month==3 ||month==4||month==5) {
			System.out.println("현재의 계절은 봄 입니다.");
		}else if(month==6 ||month==7||month==8) {
			System.out.println("현재의 계절은 여름 입니다.");
		}else if(month==9 ||month==10||month==11) {
			System.out.println("현재의 계절은 가을 입니다.");
		}else {
			System.out.println("현재의 계절은 겨울 입니다.");
		}// end of if else
	} // end of main

}// end of class
