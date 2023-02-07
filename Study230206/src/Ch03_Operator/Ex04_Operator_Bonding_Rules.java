package Ch03_Operator;

public class Ex04_Operator_Bonding_Rules {

	public static void main(String[] args) {
		//연산자들이 있을때 특히 우선순위가 같은 연산자들이 있을때 규칙 = 연산자의 결합규칙
		int x = 3 + 4 -5;
		System.out.println("3 + 4 - 5의 결과는"+x);
		System.out.println();
		int y, z;
		y = z = 3; //  y에 3이 저장된 후에 z에 3이 저장됨
		System.out.println("y=z=3의 결과");
		System.out.println("y="+y);
		System.out.println("z="+z);
	} // end of main

} // end of class
