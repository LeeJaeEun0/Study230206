package Ch04_Conditionals_Iterations;

public class Ex12_Random_Int {

	public static void main(String[] args) {
		// Math.random()을 사용 -> 0.0~1.0 사이의 숫자 중에 랜덤으로 숫자를 뽑는다
		// 0.0은 포함, 1.0은 포함되지 않는다
		int num = 0;
		
		// 괄호 안의 내용을 5번 반복한다.
		for (int i=1; i <=5; i++) {
			num = (int)(Math.random() *6) +1; //1과 6사이의 임의의 수를 얻어 출력
			System.out.println(num); // 실행할때마다 다른 결과
		}// end of for i

	} // end of main

} // end of class
