package Ch03_Operator;

public class Practice3_4 {

	public static void main(String[] args) {
		// 사과를 하나의 바구니에 10개씩 넣을 수 있다
		int numOfApple = 123; // 사과의 개수
		int sizeOfBucket = 10; // 바구니의 크기(바구니에 담을 수 있는 사과의 개수)
		// numOfBucket = /* 여기 부분에 답을 입력하세요! */ // 모든 사과를 담는데 필요한 바구니의 수
		int numOfBucket = (numOfApple / sizeOfBucket) + (numOfApple % sizeOfBucket > 0 ? 1 : 0);

		System.out.println("필요한 바구니의 수 : " + numOfBucket);

	} // end of main

} // end of class
