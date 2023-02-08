package Ch05_Array;

public class Ex05_Array_Reset {

	public static void main(String[] args) {
		int[] score = new int[5];
		score[0]=50;
		score[1]=50;
		score[2]=50;
		score[3]=50;
		score[4]=50;

		int[] score2 = new int[5];
		for(int i=0; i<5; i++) {
			score[i] = i*10+50;
		}// end of for i
		
		//int[] score3 = new int[5]{50,60,70,80,90}; // 에러 발생
		
		int[] score4 = {50,60,70,80,90};
	} // end of main

}// end of class
