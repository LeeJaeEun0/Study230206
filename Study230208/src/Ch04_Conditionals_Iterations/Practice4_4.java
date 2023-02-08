package Ch04_Conditionals_Iterations;

public class Practice4_4 {

	public static void main(String[] args) {
		int sum=0, i=1;
		
		while(sum<= 100) {
			if (i%2 !=0) sum += i;
			else sum+= (-i);
			i++;
		}// end of while
		System.out.println("i는 "+i+"이고, sum은 "+sum+"입니다");
	} // end of main

} // end of class
