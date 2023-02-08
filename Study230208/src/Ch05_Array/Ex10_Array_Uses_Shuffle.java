package Ch05_Array;

import java.util.Arrays;

public class Ex10_Array_Uses_Shuffle {

	public static void main(String[] args) {
		int[] numArr = {0,1,2,3,4,5,6,7,8,9};
		System.out.println(Arrays.toString(numArr)); 
		
		for(int i=0; i < 100; i++) {
			int n = (int) (Math.random()*10); // 0~9사이의 값을 임의로 얻는다
			int tmp = numArr[0];
			numArr[0] = numArr[n]; // 임의로 얻은 숫자를 인덱스로 사용해서 섞기(shuffle)
			numArr[n] = tmp;
		} // end of main
		System.out.println(Arrays.toString(numArr));

	} // end of main

} // end of class
