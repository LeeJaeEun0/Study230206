package Ch04_Conditionals_Iterations;

public class Practice4_7 {

	public static void main(String[] args) {
		// 각 자리의 합을 더한 결과를 출력하는 코드 만들기
		String str = "12345";
		int sum =0;
		
		for (int i=0; i < str.length(); i++) {
			// 여기에 알맞은 코드를 넣으세요!
			sum += str.charAt(i) - '0';
		}// end of for i
		
		System.out.println("총 합의 결과 sum="+sum);
	} // end of main

} // end of class
