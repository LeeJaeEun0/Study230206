package Ch06_Object_Oriented_Programming;

public class Ex_6_1 {

	public static void main(String[] args) {
		// 객체를 생성
		Tv t; // Tv 인스턴스를 참조하기 위해서 변수 t를 선언
		t = new Tv(); // Tv 인스턴스를 생성

		// 객체를 사용
		t.color = "red";
		t.channel = 7; // Tv 인스턴스의 멤버변수 channel의 값을 7로 한다.
		t.channelUp(); // Tv 인스턴스의 메서드 channelDown()을 호출한다.
		System.out.println("현재 채널은 " + t.channel + " 입니다");
		t.power = true;
		System.out.println("전원: " + t.power);
		t.power();
		System.out.println("전원: " + t.power);
		t.power();
		System.out.println("전원: " + t.power);
	} // end of main

} // end of class

class Tv {
	// TV의 속성(멤버변수)
	String color; // 색상
	boolean power; // 전원상태(on/off)
	int channel; // 채널

	// Tv의 기능
	void power() {
		power = !power;
	} // TV를 켜거나 끄는 기능을 하는 메서드

	void channelUp() {
		++channel;
	} // Tv의 채널을 높이는 기능을 하는 메서드

	void channelDown() {
		--channel;
	} // Tv의 채널을 낮추는 기능을 하는 메서드
}// end of class