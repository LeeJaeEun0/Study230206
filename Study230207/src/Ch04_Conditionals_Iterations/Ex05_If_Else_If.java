package Ch04_Conditionals_Iterations;

public class Ex05_If_Else_If {

	public static void main(String[] args) {
		// if와 else if문엣 참이면 문장을 실행하고 조건식을 벗어나지만 모두 거짓인 경우 else문 실행
		int score=80;
		char grade;
		if(score >=90) {
			grade ='A';
		} else if(score >= 80) {
			grade ='B';
		}else if(score >= 70) {
			grade ='C';
		}else if(score >= 60) {
			grade ='D';
		}else {
			grade='F';
		} // end of if else if else
		System.out.printf("점수는 %d 학점은 %c 입니다.", score, grade);
	} // end of main

} // end of class
