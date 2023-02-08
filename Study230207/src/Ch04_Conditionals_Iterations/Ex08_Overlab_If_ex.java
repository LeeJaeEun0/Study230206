package Ch04_Conditionals_Iterations;
import java.util.Scanner;
public class Ex08_Overlab_If_ex {

	public static void main(String[] args) {
		int score = 0;
		char grade = ' ', op = '0';
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("점수를 입력해주세요> ");
		score = scanner.nextInt(); // 화면을 통해 입력 받은 점수를 score에 저장
		
		if(score >=90) { //score가 90점 보다 크거나 같으면 A학점
			grade ='A';
			if (score >=95)
				op = '+';
			else
				op='-';
		} else if(score >= 80) {//score가 80점 보다 크거나 같으면 B학점
			grade ='B';
			if (score >=85)
				op = '+';
			else
				op='-';
		}else if(score >= 70) {//score가 70점 보다 크거나 같으면 C학점
			grade ='C';
			if (score >=75)
				op = '+';
			else
				op='-';
		}else if(score >= 60) {//score가 60점 보다 크거나 같으면 D학점
			grade ='D';
			if (score >=65)
				op = '+';
			else
				op='-';
		}else {
			grade='F'; //나머지 경우는 F학점
			op=' ';
		} // end of if else if else
		System.out.printf("점수는 %d 학점은 %c%c 입니다.", score, grade,  op);
		

	} // end of main

} // end of class
