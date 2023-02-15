package Ch07_Object_Oriented_Programming;

class Product2{
	int price; // 제품의 가격
	int bonusPoint; // 제품구매시 제공하는 보너스 점수
	
	Product2(int price){
		this.price = price;
		this.bonusPoint = (int)(price/10.0); // 보너스 점수는 제품 가격의 10%
	} 
	public Product2() {} // 기본 생성자
} // end of class

class Tv2 extends Product2{
	Tv2(){super(100);}
	public String toString() {return "TV";}
} // end of class

class Computer2 extends Product2{
	public Computer2() { super(200);	}
	public String toString() {return "Computer";}
} // end of class

class Audio2 extends Product2{
	public Audio2() { super(50);	}
	public String toString() {return "Audio";}
} // end of class

class Buyer2 { // 고객, 물건을 사는 사람
	int money = 300; // 소유고객
	int bonusPoint = 0; // 보너스 점수
	Product2[] cart = new Product2[10]; // 구입한 제품을 저장하기 위한 배열
	int i = 0; 
	
	void buy(Product2 p) {
		if(money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}// end of if
		
		money -= p.price; // 가진 돈에서 구입한 제품의 가격을 뺀다
		bonusPoint += p.bonusPoint; // 제품의 보너스 점수를 추가한다
		cart[i++]=p; // 제품을 Product[] cart에 저장
		System.out.println(p+"을/를 구입하셨습니다.");// 아래의 문장과 동일
		//System.out.println(p.toString()+"을/를 구입하셨습니다.");
		
	} // end of buy()
	
	void summary() { // 구매한 물품에 대한 정보를 요약해서 보여준다
		int sum = 0; //구입한 물품의 가격 합계
		String itemList = ""; // 구입한 물품 목록
		
		// 반복문을 이용해서 구입한 물품의 가격과 목록을 만든다
		for (int i=0; i<cart.length; i++) {
			if(cart[i] == null) break;
			sum+= cart[i].price;
			itemList += cart[i] + ", ";
			// itemList += cart[i].toString() + ", ";
			// 객체의 toString()을 호출함
			
		}// end of for i
		System.out.println("구입한 목록의 총금액은 "+sum+ "만원 입니다.");
		System.out.println("구입하신 제품은 "+ itemList+" 입니다.");
		
	} // end of summary() 
  	
} // end of class

public class Ex7_9_Array {

	public static void main(String[] args) {
		Buyer2 b = new Buyer2();
		
		b.buy(new Tv2());
		b.buy(new Audio2());
		b.buy(new Computer2());		
		b.summary();

	}// end of main

} // end of class
