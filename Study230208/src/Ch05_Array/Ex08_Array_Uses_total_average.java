package Ch05_Array;

public class Ex08_Array_Uses_total_average {

	public static void main(String[] args) {
		int sum=0;
		float average = 0f;
		
		int[] score = {100, 88,100, 100, 90};
		for(int i = 0; i< score.length; i++) {
			sum += score[i];
		} //end of for i
		
		average = sum/ (float)score.length; // float으로 된 결과를 얻기 위해 한쪽을 형변환
		
		System.out.println("총합: "+sum);
		System.out.println("평균: "+average);

	} // end of main

} // end of class
