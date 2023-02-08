package Ch05_Array;
import java.util.Arrays; // Arrays.toString()을 사용하기 위해 추가
public class Ex07_Array_Print_ex {

	public static void main(String[] args) {
		int[] iArr1 = new int[10];
		int[] iArr2 = new int[10];
		int[] iArr3 = {100, 95, 80, 70, 60};
		char[] chArr = {'a', 'b', 'c', 'd'};
		
		for(int i=0; i<iArr1.length; i++) {
			iArr1[i] = i +1; // 1부터 10까지 배열에 넣는다
		} // end of for i
		
		for(int i=0; i<iArr2.length; i++) {
			iArr1[i] = (int)(Math.random()*10)+1; // 배열에 랜덤 값을 저장
		} // end of for i
		
		// 배열에 저장된 값들을 출력
		for(int i=0; i<iArr1.length; i++) {
			System.out.print(iArr1[i]+",");
		}// end of for i
		System.out.println();
		
		System.out.println(Arrays.toString(iArr2));
		System.out.println(Arrays.toString(iArr3));
		System.out.println(Arrays.toString(chArr));
		System.out.println(iArr3);
		System.out.println(chArr);
	} // end of main

} // end of class
