package Ch8_Exception_Handling;

public class Preatice8_8 {
    public static void main(String[] args) {
        try {
            method1();
            System.out.println(6);
        } catch (Exception e) {
            System.out.println(7);
        } // end of try catch
    } // end of main

    static void method1() throws Exception {
        try {
            method2();
            System.out.println(1);
        } catch (NullPointerException e) {
            System.out.println(2);
            throw e; // 예외 되던지기
        } catch (Exception e) {
            System.out.println(3);
        } finally {
            System.out.println(4);
        } // end of try cathch

        System.out.println(5);
    } // end of method1()

    static void method2() {
        throw new NullPointerException();
    } // end of method2()

} // end of class
