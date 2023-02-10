package Ch06_Object_oriented_Programming;

public class Ex6_4 {

	public static void main(String[] args) {
		// 2. 객체를 생성
		MyMath mm = new MyMath();
		
		// 3. 객체를 사용
		long result1 = mm.add(5l, 3l); // add메서드 호출 // 그냥 5, 3을 넣어도 됨 => int를 long로 자동 형변환
		long result2 = mm.subtract(5l, 3l);
		long result3 = mm.multiply(5l, 3l);
		double result4 = mm.divide(5l, 3l);// 메소드를 호출했을때 자동으로 형변환 long => double
		long result5 = mm.max(5l, 3l);
		
		System.out.println("add(5l, 3l) "+result1);
		System.out.println("subtract(5l, 3l) "+result2);
		System.out.println("multiply(5l, 3l) "+result3);
		System.out.println("divide(5l, 3l) "+result4);
		System.out.println("max(5l, 3l) "+ result5);
	}// end of main

} // end of class

// 1. MyMath 클래스 작성하기
class MyMath{
	// 메서드는 클래스 안에서만 작성이 가능합니다.
	long add(long a, long b) { // 호출된 메서드가 일을 하고 return 하면 호출한 곳을 돌아간다.
		long result = a+b;
		return result;
		// return a+b;
	}// end of add()
	long subtract(long a, long b) {return a-b;}
	long multiply(long a, long b) {return a*b;}
	double divide(double a, double b) {return a/b;}
	// 두 값을 받아서 둘 중에 큰 수를 반환하는 메서드를 작성하시오 - 처럼 스스로 응용하면서 공부하는 것도 필요함
	//long max(long a, long b) {if (a>= b) return a; else return b;}
	long max(long a, long b) { return (a>= b)? a: b;}
} // end of class