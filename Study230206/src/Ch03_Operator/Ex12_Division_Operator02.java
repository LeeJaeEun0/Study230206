package Ch03_Operator;

public class Ex12_Division_Operator02 {

	public static void main(String[] args) {
		// 나머지 연산자는 음수도 허용하지만 부호는 무시 됨으로 절대값으로 나눈 나머지와 결과가 같다
		System.out.println(-10%8); // 부호 무시하고 나머지 연산을 하고 왼쪽 피연산자의 부호를 붙임
		System.out.println(10%-8); // 나누는 수가 음수인 경우 부호가 무시됨
		System.out.println(-10%-8); // 부호 무시하고 나머지 연산을 하고 왼쪽 피연산자의 부호를 붙임

	} // end of main

} // end of class
