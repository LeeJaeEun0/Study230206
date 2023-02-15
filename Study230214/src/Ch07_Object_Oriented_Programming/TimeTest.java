package Ch07_Object_Oriented_Programming;

class Time{
	int hour; // 0~23 사이의 값을 가져야함
	int minute;
	int second;
	
	private int hour1; // 0~23 사이의 값을 가져야함
	private int minute1;
	private int second1;
	public int getHour1() {
		return hour1;
	}
	
	public void setHour1(int hour1) {
		// 0보다 작거나 23보다 큰경우 return으로 빠져나가 이전의 값을 유지
		if(isNotVallidHour(hour1)) return; // 조건식의 결과가 참이면 return하는 것
		this.hour1 = hour1;
	}
	
	// 메소드로 변경하고 싶은 부분 드래그하고
	// alt + shift + m을 눌러서 메소드 만드는 창 열기
	// 매개변수로 넘겨진 hour가 유효한지 확인해서 알려주는 메서드
	// 내부에서 사용하는 메서드 => private로 변겨
	private boolean isNotVallidHour(int hour1) {
		return hour1 < 0 || hour1 > 23;
	} // end of isVallidHour()
	
} // end of class

public class TimeTest {

	public static void main(String[] args) { 
		Time t = new Time();
		t.hour = 100;
		System.out.println(t.hour);

		t.setHour1(21);
		System.out.println(t.getHour1());
		t.setHour1(100);
		System.out.println(t.getHour1());
	} // end of main

} // end of class
