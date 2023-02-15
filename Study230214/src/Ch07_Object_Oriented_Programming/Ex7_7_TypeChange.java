package Ch07_Object_Oriented_Programming;

public class Ex7_7_TypeChange {

	public static void main(String[] args) {
		Car car = null;
		FireEngine fe = new FireEngine(); // 소방차 생성
		FireEngine fe2 = null;
		
		// car가 null 상태에서 다른 포인터에 복사하면 NullPointerException 발생 
		// 그러므로 실제 인스턴스 중요함
//		FireEngine fe3 = (FireEngine)car;// 조상 => 자손으로 형변환
//		Car car2 = (Car)fe3; // 자손 -> 조상으로 형변환
//		car2.drive();
		
		//FireEngine fe3 = (FireEngine)null;// 조상 => 자손으로 형변환
		//Car car2 = (Car)null; // 자손 -> 조상으로 형변환
		
//		Car c = new Car();
//		FireEngine fe3 = (FireEngine)c; // java.lang.ClassCastException 형변환 실패 에러
//		fe3.water();  // 컴파일 오케이
		
		
		fe.water(); // 소방차 객체라서 물을 뿌리는 기능을 사용가능
		car = fe; //car = (Car) fe;에서 형변환이 생략됨
		//car.water(); // car는 water가 없음
		fe2 = (FireEngine)car; // 자손 타입 <- 조상 타입, 형변환 생략불가
		fe2.water();

	} // end of main

} // end of class

class Car{
	String color;
	int door;
	
	void drive() {
		System.out.println("drive, Brrrr~");
	} // end of drive()
	
	void stop() { // 멈추는 기능
		System.out.println("stop!!!");
	} // end of stop()
	
} // end of class

class FireEngine extends Car{ // 소방차
	void water() { // 물을 뿌리는 기능
		System.out.println("water!!!");
	} // end of water()
} // end of FireEngine