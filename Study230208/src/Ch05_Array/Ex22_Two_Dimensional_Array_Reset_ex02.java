package Ch05_Array;

public class Ex22_Two_Dimensional_Array_Reset_ex02 {

	public static void main(String[] args) {
		int[][] score = {
				{100,	100,	100},
				{20,	20,		20},
				{30,	30,		30},
				{40,	40, 	40},
				{50,	50, 	50}
		};
		
		// 과목별 총점
		int korTotal = 0, engTotal= 0, mathTotal= 0;
		
		System.out.println("번 호  국 어  영 어  수 학  총 점  평 균");
		System.out.println("====================================");
		
		for(int i=0; i <score.length; i++) {
			int sum = 0; //개인별 총점
			float avg = 0.0f; // 개인별 평균
			
			// 각 과목별 총점 구하기 위해서
			korTotal  += score[i][0]; 
			engTotal  += score[i][1];
			mathTotal += score[i][2];
			
			System.out.printf("%3d", i+1);// 번호 출력
			
			for(int j=0; j< score[i].length; j++) {
				sum += score[i][j];
				System.out.printf("%6d", score[i][j]);
			}// end of for j
			avg= sum/(float)score[i].length;
			System.out.printf("%6d %6.1f%n",sum,avg);
		} // end of for i
		System.out.println("====================================");
		System.out.printf("총점:%5d %5d %5d%n", korTotal, engTotal, mathTotal);
	} // end of main

} // end of class
