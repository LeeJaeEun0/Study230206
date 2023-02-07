package Ch03_Operator;

public class Ex06_Sign_Operator {

	public static void main(String[] args) {
		// - 부호를 사용해서 부호를 바꾸는 역활
		// -(음수) => +(양수) 또는 +(양수) => 음수(-)로 바꾸는 역활을 함
		int i = -10;
		i = +i; // + 부호는 영향을 미치지 않음
		System.out.println(i);
		
		i = -10;
		i = -i; // -부호가 +부호로 변경함
		System.out.println(i);
	} // end of main

} // end of class
