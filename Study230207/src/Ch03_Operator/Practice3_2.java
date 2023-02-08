package Ch03_Operator;

public class Practice3_2 {

	public static void main(String[] args) {
		int x =2;
		int y=5;
		char c = 'A'; // A의 문자코드는 65
		
		System.out.println(y >= 5 || x < 0 && x >2); 
		System.out.println(y += 10 - x++);
		System.out.println(x+=2);
		System.out.println(!('A' <= c && c <= 'Z'));
		System.out.println('C'- c);
		System.out.println('5' - '0');
		System.out.println(c+1);
		System.out.println(++c);
		System.out.println(c++);
		System.out.println(c);

		// 결과 예측하기
		// true
		// 13
		//5
		//false
		//2
		//5
		//B 틀림 -> 66 // 1을 증가해도 변수의 값을 증가시킨 것이 아님!
		//C 틀림 -> B
		//C 틀림 -> B
		//D 틀림 -> C
	}// end of main

}// end of class
