package Ch03_Operator;

public class Ex17_Condition_Operator {

	public static void main(String[] args) {
		// 조건 연산자는 삼항연산자를 뜻함
		// 조건? 식1: 식2
		
		int x, y, z;
		int absX, absY, absZ;
		char signX, signY, signZ;
		
		x=10;
		y= -5;
		z=0;
		
		absX = x >= 0? x: -x; // x의 값이 음수면 양수로 만든다
		absY = y >= 0? y: -y;
		absZ = z >= 0? z: -z;
		// 조건 연산자를 중첩으로 사용하는 경우
		//부호 사용 양수 +, 0은 부호 없음, 음수 - 사용
		signX = x > 0 ? '+' : (x==0? ' ': '-');
		signY = y > 0 ? '+' : (y==0? ' ': '-');
		signZ = z > 0 ? '+' : (z==0? ' ': '-');

		System.out.printf("x=%c%d%n", signX, absX);
		System.out.printf("y=%c%d%n", signY, absY);
		System.out.printf("z=%c%d%n", signZ, absZ);
	} // end of main

} // end of class
