package Ch06_Object_Oriented_Programming;

public class Ex_6_2_2 {

	public static void main(String[] args) {
		Tv t1 = new Tv();	// 같은 패키지 아래 있어서 다른 파일에 있는 클래스도 사용할 수 있나?
		Tv t2 = new Tv();
		t2=t1; // t2는 t1의 주소를 가지게 됨 // 참조변수의 t1의 값을 t2에 저장
		
		System.out.println("t1의 채널 값은 "+t1.channel+" 입니다");
		System.out.println("t2의 채널 값은 "+t2.channel+" 입니다");
		
		t1.channel =7;
		System.out.println("t1의 채널 값이 변경되었습니다 : channerl 7 ");
		
		System.out.println("t1의 채널 값은 "+t1.channel+" 입니다");
		System.out.println("t2의 채널 값은 "+t2.channel+" 입니다");
		
	}// end of main

}// end of class
