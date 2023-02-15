package Ch07_Object_Oriented_Programming;

class Product{
	int price; // 제품의 가격
	int bonusPoint; // 제품구매시 제공하는 보너스 점수
	
	Product(int price){
		this.price = price;
		this.bonusPoint = (int)(price/10.0); // 보너스 점수는 제품 가격의 10%
	}
} // end of class

class Tv1 extends Product{
	Tv1(){
		// 조상 클래스의 생성자 Product(int price)를 호출한다.
		super(100); // Tv1의 가격을 100만원으로 한다
	}
	// Object 클래스의 toString()을 오버라이딩
	public String toString() {return "TV";}
} // end of class

class Computer extends Product{
	public Computer() { super(200);	}
	public String toString() {return "Computer";}
} // end of class

class Buyer { // 고객, 물건을 사는 사람
	int money = 1000; // 소유고객
	int bonusPoint = 0; // 보너스 점수
	
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}// end of if
		
		money -= p.price; // 가진 돈에서 구입한 제품의 가격을 뺀다
		bonusPoint += p.bonusPoint; // 제품의 보너스 점수를 추가한다
		System.out.println(p+"을/를 구입하셨습니다.");// 아래의 문장과 동일
		//System.out.println(p.toString()+"을/를 구입하셨습니다.");
		
	} // end of buy()
	
} // end of class

public class Ex7_8_Polymorphism_Parameters {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		
		// Product p = new Tv1();
		// b.buy(p);
		b.buy(new Tv1()); // 위의 두줄과 동일 - 참조 변수가 없어서 다른 줄에서 사용 불가
		b.buy(new Computer());
		
		
		System.out.println("현재 남은 돈은 " + b.money+"만원 입니다."); 
		System.out.println("현재 보너스점수는 " + b.bonusPoint+"점 입니다."); 

	} // end of main

} // end of class
