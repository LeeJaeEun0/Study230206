package Ch06_Object_oriented_Programming;

public class Practice6_2 {

	public static void main(String[] args) {
		Student s = new Student("홍길동",1,1,100,60,76);

		String str = s.info();
		System.out.println(str);
	} // end of main
	
} // end of class

class Student{
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	} // end of Student
	
	String info() {
		int total = kor + eng +math;
		float average = total /(float)3; 
		average = (float) (Math.round(average*10)/10.0);
		String result = name + ","+ ban+","+no+","+kor+","+eng+","+math+","+total+","+average;
		
		return result;  
		
	}// end of info
	
} // end of class