package Ch04_Conditionals_Iterations;
import java.util.Scanner;
public class Ex06_If_Else_If {

	public static void main(String[] args) {
		int score=0; // 점수를 저장하기 위한 변수
		char grade; // 학점을 저장하기 위한 변수, 공백으로 초기화 한다.
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("당신의 점수를 입력하세요> ");
		score = scanner.nextInt(); // 화면을 통해 입력받은 숫자를 score에 저장
		
		if(score >=90) { //score가 90점 보다 크거나 같으면 A학점
			grade ='A';
		} else if(score >= 80) {//score가 80점 보다 크거나 같으면 B학점
			grade ='B';
		}else if(score >= 70) {//score가 70점 보다 크거나 같으면 C학점
			grade ='C';
		}else if(score >= 60) {//score가 60점 보다 크거나 같으면 D학점
			grade ='D';
		}else {
			grade='F'; //나머지 경우는 F학점
		} // end of if else if else
		System.out.printf("점수는 %d 학점은 %c 입니다.", score, grade);

	} // end of main

} // end of class
