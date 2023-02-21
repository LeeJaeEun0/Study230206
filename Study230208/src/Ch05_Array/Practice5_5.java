package Ch05_Array;

public class Practice5_5 {

	public static void main(String[] args) {
		// 중복되지않은 숫자 3자리 만들어내는 프로그램
		int[] ballArr = {1,2,3,4,5,6,7,8,9};
		int[] ball3 = new int[3];
		
		// 배열 ballArr의 임의의 요소를 골라서 위치를 바꾼다
		for(int i=0; i<ballArr.length; i++) {
			int j = (int) (Math.random()*ballArr.length);
			
			// 알맞은 코드를 넣어 완성하시오
			int tmp = ballArr[i];
			ballArr[i] = ballArr[j];
			ballArr[j] = tmp;
			
		}// end of for i

		// 배열 ballArr의 앞에서 3개의 수를 배열 ball3로 복사한다.
		// 여기에 넣으세요!
		for(int i=0; i<3; i++)
			ball3[i] = ballArr[i];
		
		for(int i=0; i <ball3.length; i++) {
			System.out.print(ball3[i]);
		}// end of for i
		// System.arraycopy()를 사용하는 방법이 있음 
	} // end of main

} // end of class
