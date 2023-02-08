package Ch05_Array;

public class Ex03_Array_Index {

	public static void main(String[] args) {
		// 배열의 각 저장공간을 배열의 요소(element)
		// 배열의 이름[인덱스]형식으로 요소에 접근 가능
		// 인덱스는 배열의 요소마다 붙여진 일련번호
		// 인덱스의 범위는 0부터 배열 길이 -1까지 
		
		int score[];
		score = new int[5];
		
		System.out.println("값을 넣기 전 score[3] :" + score[3]);
		score[3] = 100; // 인덱스로 요소를 지정해서 값을 넣을 수 있음
		System.out.println("값을 넣은 후 score[3] :" + score[3]);

		for(int i=0; i<score.length; i++) {
			System.out.println(score[i]);
		} // end of for i
		
	} // end of main

} // end of class
