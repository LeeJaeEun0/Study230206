package Ch04_Conditionals_Iterations;

public class Ex02_if_ex02 {

	public static void main(String[] args) {
		// if문의 조건자리에 다양한 조건이 들어갈 수 있다.
		// &&과 ||을 사용해서 여러개의 조건을 같이 넣을 수도 있다.
		
		int x = 95;
		char ch = 'a';
		String str = "yes";
		
		// 숫자 비교하기
		if(90 <= x && x <= 100) System.out.println("x는 90과 100사이의 숫자");
		if(x < 0 || x > 100) System.out.println("0보다 작거나 100보다 크다");
		if(x%3==0 && x%2!=0) System.out.println("3의 배수지만 2의 배수는 아닙니다");
		
		// 문자 비교하기
		if(ch=='y' || ch=='Y') System.out.println("y 또는 Y 입니다");
		if(ch==' ' || ch=='\t' || ch=='\n') System.out.println("공백 문자이거나 탭이거나 줄바꿈 문자 입니다.");
		if('A' <= ch && ch<= 'Z') System.out.println("대문자 입니다.");
		if('a' <= ch && ch<= 'z') System.out.println("소문자 입니다.");
		if('0' <= ch && ch<= '9') System.out.println("숫자 입니다.");
		
		// 문자열 비교하기
		if(str.equals("yes")) System.out.println("yes"); // 대소문자를 구분해서 yes(소문자)만 찾음
		if(str.equalsIgnoreCase("yes")) System.out.println("yes"); // 대소문자 구분하지 않고 yes찾음
	} // end of main

} // end of class
