package Ch02_Variable;

public class Ex08_String_plus {

	public static void main(String[] args) {
		String name = "Ja"+"va";
		String str = name+ 8.0;
		// 피연사중에 하나라도 문자열이면 문자열이 아닌쪽을 문자열로 변경해서 결합한다.
		// 문자열 + ? = 문자열 + 문자열 = 문자열
		System.out.println(name);
		System.out.println(str);
		System.out.println(7+ " ");
		System.out.println(" "+ 7);
		System.out.println(7+ ""); // 문자열로 변환
		System.out.println(""+ 7); // 문자열로 반환
		System.out.println(""+"");
		System.out.println(7+7+"");
		System.out.println(""+7+7);
	} // end of main

} // end of class
