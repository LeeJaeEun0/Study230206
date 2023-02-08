package Ch04_Conditionals_Iterations;

public class Ex07_Overlab_If {

	public static void main(String[] args) {
		// if문 안에서 또 다른 if문을 사용할 수 있음
		int num = 3;
		char sign = ' ';
		
		if (num >= 0) {
			if(num != 0) sign= '+';
		}else {
			sign = '-'; 
		} // end of if else

	} // end of main

} // end of class
