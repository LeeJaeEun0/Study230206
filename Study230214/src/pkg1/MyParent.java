package pkg1;

public class MyParent{
	 // 원래 접근제어자가 default였는데 다른 패키지에서 사용하기 위해
	 // public으로 바꿔주기 + 파일명과 일치해야함 -> 파일명도 변경함
	private int prv; // 같은 클래스
			int dft; // 같은 패키지
	protected int prt; // 같은 패키지 + 자손(다른 패키지)
	public int pub; // 접근제한 없음
	
	public void printMembers() {
		System.out.println(prv);
		System.out.println(dft);
		System.out.println(prt);
		System.out.println(pub);
	} // end of printMembers()
	
} // end of MyParent

 class MyParentTest {
	// 원래 접근 제어자가 public이지만 하나의 파일안에 public이 한개여야함 => default로 변경
	public static void main(String[] args) {
		MyParent p = new MyParent();
		//System.out.println(p.prv); // 에러 - 다른 클래스
		System.out.println(p.dft); // OK - 같은 패키지
		System.out.println(p.prt); // OK - 같은 패키지
		System.out.println(p.pub); // OK - 같은 패키지

	} // end of main

} // end of class
