package Ch8_Exception_Handling;

public class Ex8_9_Exception {
    public static void main(String[] args) throws Exception {
        method1();
    } // end of main
    
    static void method1() throws Exception{
        method2();
    } // end of method1()

    static void method2() throws Exception{
        throw new Exception();
    } //  end of methd2
} // end of class
