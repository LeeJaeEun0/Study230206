package Ch02_Variable;

public class Practice2_8 {

	public static void main(String[] args) {
		int x = 1;
		int y = 2;
		int z = 3;

		//x,y,z의 값을 서로 바꾸는 예제
		// 답을 쓰는 부분
		int tmp = x;
		x = y;
		y=z;
		z=tmp;
		
		System.out.println("x=" + x);
		System.out.println("y=" + y);
		System.out.println("z=" + z);
	}// end of main

}// end of class
