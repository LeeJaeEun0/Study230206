package Ch8_Exception_Handling;

public class Practice8_5 {
    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {
            System.out.println(5);
        } // end of try catch
    } // end of main

    static void method1() {
        try {
            method2();
            System.out.println(1);
        } catch (ArithmeticException e) {
            System.out.println(2);
        } finally {
            System.out.println(3);
        }
        System.out.println(4);
    } // end of method1()

    static void method2() {
        throw new NullPointerException();
    } // end of method2()

} // end of class
