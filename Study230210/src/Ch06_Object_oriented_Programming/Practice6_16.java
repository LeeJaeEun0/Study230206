package Ch06_Object_oriented_Programming;

public class Practice6_16 {
	public static void change(String str) {
		str +="456";
	} // end of change
	
	public static void main(String[] args) {
		String str = "ABC123";
		System.out.println(str);
		change(str);
		System.out.println("After change:" + str);
		// 예측은 ABC123456인데 결과는 ABC123 입니다 => change()에서 반환한 값을 저장하지 않았기 때문입니다.
	} // end of main

} // end of class
