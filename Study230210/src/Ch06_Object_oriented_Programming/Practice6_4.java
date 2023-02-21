package Ch06_Object_oriented_Programming;

public class Practice6_4 {
	static double getDistance(int x, int y, int x1, int y1) {
		return Math.sqrt((x - x1) * (x - x1) + (y - y1) * (y - y1)); // x, y는 지역변수

	} // end of getDistance

	public static void main(String[] args) {
		// 두 점의 거리를 계산하는 메소드를 만드시오
		System.out.println(getDistance(1, 1, 2, 2));
	} // end of main

} // end of class
