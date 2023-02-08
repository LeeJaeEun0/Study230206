package Ch06_Object_Oriented_Programming;

public class Ex_6_2 {

	public static void main(String[] args) {
		Tv t1 = new Tv();	// 같은 패키지 아래 있어서 다른 파일에 있는 클래스도 사용할 수 있나?
		Tv t2 = new Tv();
		
		System.out.println("t1의 채널 값은 "+t1.channel+" 입니다");
		System.out.println("t2의 채널 값은 "+t2.channel+" 입니다");
		
		t1.channel =7;
		System.out.println("t1의 채널 값이 변경되었습니다 : channerl 7 ");
		
		System.out.println("t1의 채널 값은 "+t1.channel+" 입니다");
		System.out.println("t2의 채널 값은 "+t2.channel+" 입니다");
		
	}// end of main

}// end of class

//class Tv {
//	//TV의 속성(멤버변수)
//	String color;  //색상
//	boolean power; // 전원상태(on/off)
//	int channel; // 채널
//	
//	//Tv의 기능
//	void power() {power = !power;} // TV를 켜거나 끄는 기능을 하는 메서드
//	void channelUp() {++channel;} // Tv의 채널을 높이는 기능을 하는 메서드
//	void channelDown() {--channel;} // Tv의 채널을 낮추는 기능을 하는 메서드
//}// end of class