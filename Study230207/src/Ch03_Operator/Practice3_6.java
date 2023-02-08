package Ch03_Operator;

public class Practice3_6 {

	public static void main(String[] args) {
		// 화씨와 섭씨를 변환하는 코드
		int fahrenheit = 100;
		//float celcius = (/* 여기에 코드를 입력하세요 */);
		// float celcius = (5/(float)9 * (fahrenheit-32)*1000)*1000; - 틀림
		float celcius = (int)((5/9f * (fahrenheit - 32))*100 + 0.5) / 100f;

		System.out.println("Fahrenheit "+fahrenheit);
		System.out.println("Celcius "+ celcius);
	} // end of main

} // end of class
