package Ch06_Object_oriented_Programming;

public class Ex6_10_Overloading {
	
	public static void main(String[] args) {
		MyMath3 mm = new MyMath3();
		System.out.println("mm.add(3, 3) 결과: "+mm.add(3,3));
		// 만약 int add(int a, int b) 메서드가 없다면 아래의 에러 발생
		//The method add(long, int) is ambiguous for the type MyMath3 => 3,3을 어떤 메서드에 넣을지 모호해서 에러 발생
		System.out.println("mm.add(3L, 3) 결과: "+mm.add(3L,3));
		System.out.println("mm.add(3, 3L) 결과: "+mm.add(3,3L));
		System.out.println("mm.add(3L, 3L) 결과: "+mm.add(3L,3L));
		
		int[] a = {100, 200, 300};
		System.out.println("mm.add(a) 결과: "+ mm.add(a));

	} // end of main

} // end of class

class MyMath3{
	int add(int a, int b) {
		System.out.print("int add(int a, int b) - ");
		return a+b;
	} // end of add 
	
	long add(long a, int b) {
		System.out.print("long add(long a, int b) - ");
		return a+b;
	} // end of add 
	
	long add(int a, long b) {
		System.out.print("long add(int a, long b) - ");
		return a+b;
	} // end of add 
	
	long add(long a, long b) {
		System.out.print("long add(long a, long b) - ");
		return a+b;
	} // end of add 
	
	int add(int[] a) { // 배열 모든 요소들의 합을 결과로 돌려준다
		System.out.print("int add(int[] a) - ");
		int result = 0;
		for(int i=0; i< a.length; i++) {
			result += a[i];
		} // end of for i
		return result;
	} // end of add 
	
} // end of class