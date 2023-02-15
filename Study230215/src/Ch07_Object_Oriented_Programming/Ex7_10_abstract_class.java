package Ch07_Object_Oriented_Programming;

public class Ex7_10_abstract_class {

	public static void main(String[] args) {
		//Object[] group = {new Marine(), new Tank(), new Dropship()};
		// Object에 move()가 없기 때문
		Unit[] group = {new Marine(), new Tank(), new Dropship()};
		// 위와 아래의 문장은 동일
		//Unit[] group = new Unit[3];
		//group[0] = new Marine();
		//group[1] = new Tank();
		//group[2] = new Dropship();
		
		// group의 타입은 Unit[], group[0], group[1], group[2]의 타입은 Unit
		// group[0].move(100, 200); // Marine객체의 move(100, 200)을 호출
		// group[1].move(100, 200); // Tank객체의 move(100, 200)을 호출
		// group[2].move(100, 200); // Dropship객체의 move(100, 200)을 호출
		
		for(int i = 0; i < group.length; i++) {
			group[i].move(100, 200);
		} // end of for i
	} // end of main

} // end of class

abstract class Unit{
	int x, y;
	abstract void move(int x, int y);
	void stop() {/* 현재 위치에 정지*/}
} // end of class

class Marine extends Unit{ // 보병
	void move(int x, int y) {
		System.out.println("Marine[x="+x+" , y="+y+"]");
	}// end of move()
	void stimPack() {/* 스팀팩을 사용한다 */}
} // end of class

class Tank extends Unit{ // 탱크
	void move(int x, int y) {
		System.out.println("Tank[x="+x+" , y="+y+"]");
	}// end of move()
	void changeMode() {/* 공격모드를 변환한다. */}
} // end of class

class Dropship extends Unit{ // 수송선
	void move(int x, int y) {
		System.out.println("Dropship[x="+x+" , y="+y+"]");
	}// end of move()
	void load() {/* 선택된 대상을 태운다 */}
	void unload() {/* 선택된 대상을 내린다 */}
} // end of class