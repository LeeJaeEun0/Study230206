package Ch05_Array;

public class Ex13_String_Array_Reset {

	public static void main(String[] args) {
		String[] name = new String[3];
		name[0]= "Kim";
		name[1]= "Park";
		name[2]= "Yi";

		String[] name1 = {"Kim", "Park", "Yi"};
		
		for(int i=0; i< name1.length; i++)
			System.out.println("names["+i+"]: "+name1[i]);
		System.out.println();
		
		String tmp = name1[2]; // 배열의 세번째요소를 tmp에 저장
		System.out.println("tmp: "+tmp);
		name1[0] ="Yu"; // 배열 첫번째 요소 변경
		
		System.out.println();
		for(int i=0; i< name1.length; i++)
			System.out.println("names["+i+"]: "+name1[i]);
	} // end of main

} // end of class
