package Ch8_Exception_Handling;

public class Ex8_12_Exception_Re_throwing {
    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {
            System.out.println("main메서드에서 예외가 처리되었습니다!");
        } // end of try catch
    } // end of main

    static void method1() throws Exception {
        try {
            throw new Exception();
        } catch (Exception e) {
            // catch문에 들어갔다 = 예외를 처리했다.
            // 예외를 발생시킨 문장을 다시 발생
            System.out.println("method1 메서드에서 예외가 처리 되었습니다.");
            throw e; // 다시 예외를 발생시킨다
        } // end of try catch
    } // end of method1()

} // end of class
