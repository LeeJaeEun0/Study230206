package Ch8_Exception_Handling;

public class Practice8_6 {
    static void method(boolean b) {
        try {
            System.out.println(1);
            if (b)
                System.exit(0);
            System.out.println(2);
        } catch (RuntimeException r) {
            System.out.println(3);
            return;
        } catch (Exception e) {
            System.out.println(4);
            return;
        } finally {
            System.out.println(5);
        } // end of try catch
        System.out.println(6);
    } // end of method()

    public static void main(String[] args) {
        method(true);
        method(false);
    } // end of main
} // end of class
