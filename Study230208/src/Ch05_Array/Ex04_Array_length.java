package Ch05_Array;

public class Ex04_Array_length {

	public static void main(String[] args) {
		// 배열이름.length를 사용해서 배열의 길이에 대한 정보를 얻을 수 있음
		
		int[] arr = new int[5]; // 길이가 5인 int 배열
		int tmp = arr.length; // tmp에 길이 저장
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		} // end of for i

	}// end of main

} // end of class
