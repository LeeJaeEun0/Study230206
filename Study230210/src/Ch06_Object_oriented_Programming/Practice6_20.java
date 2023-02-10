package Ch06_Object_oriented_Programming;

public class Practice6_20 {

	public static void main(String[] args) {
		int[] data = {3,2,9,4,7};
		System.out.println(java.util.Arrays.toString(data));
		System.out.println("최댓값 : "+ max(data));
		System.out.println("최댓값 : "+ max(null));
		System.out.println("최댓값 : "+ max(new int[] {})); // 크기가 0인 배열
	} // end of main

	private static int max(int[] data) {
		int result=0;
		if (data == null || data.length==0)
			result = - 999999;
		else {
			for(int i=0; i< data.length; i++) {
				if (result < data[i])
						result = data[i];
			}// end of for i
		} // end of if else
		return result;
	}

} // end of class
