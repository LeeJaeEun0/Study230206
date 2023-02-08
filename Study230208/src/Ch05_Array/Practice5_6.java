package Ch05_Array;

import java.util.Scanner;

public class Practice5_6 {

	public static void main(String[] args) {
			String[] words = {"television", "computer", "mouse", "phone"};
			
			Scanner scanner = new Scanner(System.in);
			
			for(int i =0; i < words.length; i++) {
				char[] question = words[i].toCharArray(); //string을 char로 변환
				
//				// 알맞은 코드를 작성하시오
//				for(int j =0; i < question.length; j++) {
//					int z = (int) (Math.random()*question.length)+1;
//					char tmp = qustion[j];
//					qustion[j] = qustion[z];
//					qustion[z] = tmp;
//				}// end of for j
				
				for(int j=0;j<question.length;j++) {
					int idx = (int)(Math.random() * question.length);
					char tmp = question[i]; // i는 고정으로 두고 랜덤인 다른 숫자를 바꾸는 것
					question[i] = question[idx];
					question[idx] = tmp;
					}

				
				System.out.printf("Q%d. %s의 정답을 입력하세요", i+1, new String(question));
				
				String answer = scanner.nextLine();
				
				//trim()으로 answer의 좌우 공백을 제거한 후 equals로 word[i]와 비교
				if (words[i].equals(answer.trim()))
					System.out.printf("맞았습니다.%n%n");
				else
					System.out.printf("틀렸습니다.%n%n");
			} // end of for i
	} // end of main

} // end of class
