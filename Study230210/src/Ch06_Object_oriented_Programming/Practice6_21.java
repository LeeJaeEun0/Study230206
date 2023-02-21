package Ch06_Object_oriented_Programming;

public class Practice6_21 {

	public static void main(String[] args) {
		int value = 5;
		System.out.println(value + "의 절대값: " + abs(value));

		value = -10;
		System.out.println(value + "의 절대값 : " + abs(value));

	} // end of main

	// abs 메서드를 작성하세요
	private static int abs(int value) {
		// if(value >= 0) value = value;
		// else value = -value;
		// return value;
		return value >= 0 ? value : -value;

	}// end of abs

} // end of class
