package Ch07_Object_oriented_Programming;

public class OverridingTest3 {
	public static void main(String[] args) {
		Point3D_3 d = new Point3D_3(1,2,3);
		System.out.println(d.getLocation());
	} // end of main
} // end of class

class MyPoint3_3{
	int x;
	int y;
	
	MyPoint3_3(int x, int y){
		super(); // Object() 호출
		this.x = x;
		this.y = y;
	}
	
	String getLocation() {
		return "x :"+x+", y :"+y;
	} // end of getLocation()
} // end of class

class Point3D_3 extends MyPoint3_3{
	int z;
	//Implicit super constructor MyPoint3_3() is undefined. Must explicitly invoke another constructor
	//at Study230213/Ch07_Object_oriented_Programming.Point3D_3.<init>(OverridingTest3.java:27)
	//at Study230213/Ch07_Object_oriented_Programming.OverridingTest3.main(OverridingTest3.java:5)
//	Point3D_3(int x, int y, int z){
//		this.x = x;
//		this.y= y;
//		this.z =z;
//	}
	
	Point3D_3(int x, int y, int z){
		 // super(); // 기본 생성자가 없어서 에러 발생
		// super()은 기본 생성자를 호출
		super(x,y); //
		this.x = x;
		this.y= y;
		this.z =z;
	}

	
	String getLocation() {
		return "x :"+x+", y :"+y+", z :"+z;
	} // end of getLocation()
} // end of class