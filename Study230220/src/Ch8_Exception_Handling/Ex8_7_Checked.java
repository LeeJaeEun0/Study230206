package Ch8_Exception_Handling;

public class Ex8_7_Checked {
    public static void main(String[] args) {
        throw new Exception(); // Exception을 고의로 발생시킨다
        // 컴파일 에러, 예외처리 안해서 오류발생
        // Exception과 그 자손은 반드시 예 외처리를 해야함(필수)
        // try {
        // throw new Exception("hi");
        // } catch (Exception e) {
        // System.out.println();
        // }

        // RuntimeException과 그 자손들은 예외처리가 선택
    } // end of main

} // end of class