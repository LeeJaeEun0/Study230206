package Ch03_Operator;

public class Practice3_3 {

	public static void main(String[] args) {
		// 아래는 num의 값 중에서 백의 자리 이하를 버리는 코드
		int num = 456;
		// println(/* 여기에 정답을 입력하세요*/)
		System.out.println((num/100)*100);
		System.out.println(num-num%100);
	} // end of main

} // end of class
