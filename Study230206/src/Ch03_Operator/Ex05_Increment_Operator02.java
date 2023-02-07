package Ch03_Operator;

public class Ex05_Increment_Operator02 {

	public static void main(String[] args) {
		int i = 5, j = 0;
		j = i++; //j에 기존에 있던 i값을 대입하고(기존의 i값을 참조) i를 1증가
		System.out.println("j++; 실행후 , i="+i+", j= "+j);
		
		// 위의 문장을 풀어서 쓴 형태
		i=5;
		j=0;
		j=i;
		i++;
		System.out.println("j++; 실행후 , i="+i+", j= "+j);		
	} // end of main

} // end of class
