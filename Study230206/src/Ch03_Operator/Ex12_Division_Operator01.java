package Ch03_Operator;

public class Ex12_Division_Operator01 {

	public static void main(String[] args) {
		// 나머지 연산자는 나누하고 남은 나머지의 결과를 출력
		// 주로 짝수, 홀수, 배수 검사 등에 주로 사용
		int x = 10;
		int y = 8;
		
		System.out.printf("%d을 %d로 나누면, %n",x,y);
		System.out.printf("몫은 %d이고, 나머지는 %d 입니다.%n", x/y, x%y);
	} // end of main

} // end of class
