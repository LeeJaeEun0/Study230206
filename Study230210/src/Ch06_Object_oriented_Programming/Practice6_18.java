package Ch06_Object_oriented_Programming;

public class Practice6_18 {

	public static void main(String[] args) {
		String str = "123";
		System.out.println(str + "는 숫자 입니까? " + isNumber(str));
		
		str = "1234o";
		System.out.println(str + "는 숫자 입니까? " + isNumber(str));
	} // end of main

	// isNumber메서드를 작성하시오
	private static boolean isNumber(String str) {
		char[] strs=str.toCharArray();
		boolean bool = false ;
		for(int i=0; i< str.length(); i++) {
			switch(strs[i])
			{
				case '1':
				case '2':
				case '3':
				case '4':
				case '5':
				case '6':
				case '7':
				case '8':
				case '9':
				case '0': bool = true; break;
				default : bool= false; break;
			}
			if (bool == false) break;
		}// end of for i
		
		return bool;
	}

} // end of class
