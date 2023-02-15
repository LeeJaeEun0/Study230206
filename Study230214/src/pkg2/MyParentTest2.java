package pkg2;

import pkg1.MyParent; // ctrl+shift+o

class MyChild extends MyParent{ 
	// 오류 발생 - Myparent의 접근 제어자가 default => 같은 패키지 내에서 호출가능
	public void printMembers() {
		//System.out.println(prv); // 에러 - 같은 클래스 내에서만
		//System.out.println(dft); // 에러 - 같은 패키지 내
		System.out.println(prt); // OK - 상속받아서
		System.out.println(pub); // OK - 접근 제한X
	} // end of printMembers()
} // end of class

public class MyParentTest2 {

	public static void main(String[] args) {
		MyParent p = new MyParent();
		//System.out.println(p.prv); // 에러 - 다른 클래스
		//System.out.println(p.dft); // 에러 - 다른 패키지
		//System.out.println(p.prt); // 에러 - 다른 패키지, 상속 x
		System.out.println(p.pub); // OK - 접근 제한 x

	} //end of main

} // end of class
