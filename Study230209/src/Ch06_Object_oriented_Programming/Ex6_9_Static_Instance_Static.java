package Ch06_Object_oriented_Programming;

class MyMath2{
	long a, b;
	
	// 인스턴스 변수 a, b만을 이용해서 작업하므로 매개변수가 필요없다
	long add() {return a+b;} // a와 b는 인스턴스 변수
	long subtract() {return a-b;}
	long multiply() {return a*b;}
	double divide() {return a/b;}
	
	// 인스턴스 변수와 관계없이 매개변수만으로 작업이 가능하다
	static long add(long a, long b) {return a+b;} // a,b는 지역변수
	static long subtract(long a, long b) {return a-b;}
	static long multiply(long a, long b) {return a*b;}
	static double divide(long a, long b) {return a/(double)b;}

} // end of class

public class Ex6_9_Static_Instance_Static {

	public static void main(String[] args) {
		// 클래스 메서드 호출. 인스턴스 없이 생성하기 호출 가능
		// 객체를 생성하지않아도 사용 가능
		System.out.println("인스턴스 변수 사용");
		System.out.println(MyMath2.add(200l,100));
		System.out.println(MyMath2.subtract(200l,100));
		System.out.println(MyMath2.multiply(200l,100));
		System.out.println(MyMath2.divide(200l,100l));
		System.out.println();
		
		MyMath2 mm = new MyMath2(); // 인스턴스를 생성 // 객체를 반드시 생성
		mm.a = 200l;
		mm.b = 100l;
		
		// 인스턴스 메서드는 객체 생성 후에만 호출이 가능함
		System.out.println("인스턴스 생성");
		System.out.println(mm.add());
		System.out.println(mm.subtract());
		System.out.println(mm.multiply());
		System.out.println(mm.divide());
		
	} // end of main

} // end of class
