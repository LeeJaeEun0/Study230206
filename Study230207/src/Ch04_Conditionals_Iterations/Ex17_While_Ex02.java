package Ch04_Conditionals_Iterations;

public class Ex17_While_Ex02 {
	public static void main(String[] args) {
		int sum =0;
		int i=0;
		// i를 1씩 증가해서 sum에 더함
		while(sum <=100) {
			System.out.printf("%d - %d%n",i, sum);
			sum += ++i;
		}// end of 
		 
	} // end of main
}// end of class
