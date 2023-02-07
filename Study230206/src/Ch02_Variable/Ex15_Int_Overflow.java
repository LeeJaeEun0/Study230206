package Ch02_Variable;

public class Ex15_Int_Overflow {

	public static void main(String[] args) {
		// 오버플로우: 해당 타입이 표현할 수 있는 값의 범위를 넘어서는 경우
		// 계량기라고 생각하면 최고 값이 9999, min 0000 이고 값을 벗어날 수 없음
		System.out.println("max: 9999, min:0000");
		System.out.println("최대값 + 1 = 최솟값");
		System.out.println("9999 + 1 = 0000");
		System.out.println("최소값 - 1 = 최대값");
		System.out.println("0000 - 1 = 9999");
	}// end of main

} // end of class
