package Ch04_Conditionals_Iterations;
import java.util.Scanner;

public class Ex19_Do_While {

	public static void main(String[] args) {
		// 다른 반복문과 다르게 블럭을 먼저 실행하고 조건식을 확인
		// do while문은 최소 한번은 수행 된다.
		int input = 0, answer =0;
		
		answer = (int)(Math.random()*100) + 1; //1~100사이의 임의수 저장;
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.print("1과 100사이의 정수를 입력하세요: ");
			input = scanner.nextInt();
			
			if(input> answer) {
				System.out.println("더 작은 수로 다시 시도해보세요");
			}else if(input<answer) {
				System.out.println("더 큰 수로 다시 시도해보세요");
			}// end of if else
		}while(input!=answer);// end of do while
		System.out.println("정답입니다!");
	} // end of main

} // end of class
