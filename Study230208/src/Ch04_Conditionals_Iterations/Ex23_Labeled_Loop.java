package Ch04_Conditionals_Iterations;

public class Ex23_Labeled_Loop {

	public static void main(String[] args) {
		// for문에 Loop1이라는 
		Loop1 : for (int i=2; i<=9; i++) { // 단
			for(int j=1; j<=9;j++) { // 곱하기
				if(j==5)
					//break Loop1;
					//break;
					continue Loop1; // 
					//continue;
				System.out.println(i+"*"+j+"="+i*j);
			}// end of for j
			System.out.println();
		}// end of for i
	} // end of main

} // end of class
