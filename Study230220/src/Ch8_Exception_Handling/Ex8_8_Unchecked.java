package Ch8_Exception_Handling;

public class Ex8_8_Unchecked {
    public static void main(String[] args) {
        throw new RuntimeException();
        // java.lang.RuntimeException에러 발생해서 비정상 종료
        // 예외 처리, 컴파일 에러가 발생x라고 런타임에러 발생안하는 것은 아니다
    } // end of main
} // end of class
