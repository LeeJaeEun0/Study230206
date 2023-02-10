package Ch06_Object_oriented_Programming;

public class Practice6_7 {

	public static void main(String[] args) {

	} // end of main

} // end of class

class Marine{
	// static를 붙여야하는 경우는?
	int x = 0, y = 0;  // Marine의 위치좌표(x,y)
	int hp = 60;      // 현재 체력
	int weapon = 6;  // 공격력 -> static을 붙여야함 => 모든 병사의 공격력과 방어력이 같아야하기때문
	int armor = 0;   // 방어력 -> static을 붙여야함
	
	void weaponUp(){
		weapon++;
	} // end of weaponUp
	
	void armorUp() {
		armor++;
	} // end of armorUp
	
	void move(int x, int y) {
		this.x = x;
		this.y = y;
	}// end of move
} // end of class