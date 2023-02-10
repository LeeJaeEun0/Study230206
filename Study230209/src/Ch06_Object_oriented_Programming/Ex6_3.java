package Ch06_Object_oriented_Programming;

public class Ex6_3 {

	public static void main(String[] args) {
		System.out.println("Card.width = "+ Card.width);	// 클래스명.변수를 통해서 변수 직접 사용 할 수 있음
		System.out.println("Card.height = "+ Card.height);
		
		Card c1 = new Card();
		c1.kind = "Heart"; // 인스턴스의 변수 값을 설정
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 4;
		
		System.out.println("c1은 "+c1.kind+", "+c1.number+"이며, 크기는 ("+c1.width+","+c1.height+")");
		System.out.println("c2은 "+c2.kind+", "+c2.number+"이며, 크기는 ("+c2.width+","+c2.height+")");
		System.out.println("c1의 width와 height를 각각 50, 80으로 변경합니다.");
		
		// 전역변수를 수정하니까 모두 같은 폭과 높이를 가진다
		// Card.width =50 ;
		// Card.heigth = 80; 과 같음
		c1.width =50; // 클래스 변수의 값을 설정
		c1.height = 80;
		
		System.out.println("c1은 "+c1.kind+", "+c1.number+"이며, 크기는 ("+c1.width+","+c1.height+")");
		System.out.println("c2은 "+c2.kind+", "+c2.number+"이며, 크기는 ("+c2.width+","+c2.height+")");
		
	} // end of main

} // end of class

class Card{
	String kind;
	int number;
	static int width = 100;
	static int height = 250;
}// end of class