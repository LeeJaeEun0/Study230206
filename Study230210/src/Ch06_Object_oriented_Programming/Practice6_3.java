package Ch06_Object_oriented_Programming;

public class Practice6_3 {

	public static void main(String[] args) {
		Student2 s = new Student2();
		s.name = "홍길동";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng =60;
		s.math =76;
		
		System.out.println("이름 : "+ s.name);
		System.out.println("총점 : "+s.getTotal());
		System.out.println("평균 : "+ s.getAverage());
		
	} // end of main

} // end of class
class Student2{
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	int getTotal() {
		return kor+eng+math;
	} // end of getTotal
	
	float getAverage() {
		int total = getTotal();
		
		float average = (float) (total / 3.0);
		average = (float) (Math.round(average*10)/10.0);
		return average;
	}// end of getAverage
	
	
	
} // end of class