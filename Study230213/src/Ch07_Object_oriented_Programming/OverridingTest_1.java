package Ch07_Object_oriented_Programming;

class MyPoint3{
	int x;
	int y;
	String getLocation() {
		return "x:"+x+", y:"+y;
	} // end of getLocation()
} // end of class

class MyPoint3D extends MyPoint3{
	int z;
} // end of class

class MyPoint3D_2 extends MyPoint3{
	int z;
	String getLocation() { // 조상의 getLocation()을 오버라이딩
		return "x:"+x+", y:"+y+", z:"+z;
	} // end of getLocation()
} // end of class


public class OverridingTest_1 {

	public static void main(String[] args) {
		System.out.println("오버라이딩 전");
		MyPoint3D p = new MyPoint3D();
		p.x =3;
		p.y =5;
		p.z =7;
		System.out.println(p.getLocation());
		System.out.println();
		
		System.out.println("오버라이딩 후");
		MyPoint3D_2 p2 = new MyPoint3D_2();
		p2.x =3;
		p2.y =5;
		p2.z =7;
		System.out.println(p2.getLocation());
	} // end of main

} // end of class
