package Ch03_Operator;

public class Ex05_Increment_Operator01 {

	public static void main(String[] args) {
		// 증감 연산자는 피연산자에 저장된 값을 1증가 또는 1감소 시킴
		// 증가 연산자는 ++, 감소 연산자는 --를 사용
		// 증감 연산자가 앞에 있으면 전위형(Prefix)
		// 증감 연산자가 뒤에 있으면 후위형(Postfix)

		int i, j;
		i = 5;
		j=0;
		
		j = ++i; // i의 값을 1증가하고(증가된 i값을 참조) j에 값을 대입
		System.out.println("j=++i; 실행 후, i="+i+", j="+j);

		System.out.println();
		
		// 위의 문장을 풀어서 쓰면 이런형태
		i =5;
		j=0;
		++i;
		System.out.println("j=++i; 실행 후, i="+i+", j="+j);
	} // end of main

} // end of class
