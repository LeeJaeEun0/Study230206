package Ch06_Object_oriented_Programming;

public class Ex6_14_Member_Variable_Initalization2 {
	static int[] arr = new int[10]; // 간단 초기화
	
	static {
		for(int i=0; i<arr.length; i++) { // 복잡 초기화, 초기화 블럭
			// 1과 10 사이의 난수를 넣음
			arr[i] = (int) (Math.random()*10)+1;
		} // end of for i
	} // end of static
	
	public static void main(String[] args) {
		for(int i=0; i<arr.length; i++) {
			System.out.println("arr["+i+"] : "+ arr[i]);
		} // end of for i

	} // end of main

} // end of class
