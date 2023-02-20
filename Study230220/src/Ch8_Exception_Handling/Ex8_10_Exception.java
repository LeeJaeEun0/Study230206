package Ch8_Exception_Handling;

import java.io.File;

public class Ex8_10_Exception {
    public static void main(String[] args) {
        try {
            File f = createFile(args[0]);
            System.out.println(f.getName() + "파일이 성공적으로 생성 되었습니다.");
        } catch (Exception e) {
            System.out.println(e.getMessage() + " 다시 입력해 주시기 바랍니다.");
        } // end of try catch
    } // end of main

    // throws Exception은 예외를 생성하는 것이지 처리 할 수 있는 것이 아님
    // try catch문을 통해서 예외를 처리할 수있음 
    static File createFile(String fileName) throws Exception {
        if (fileName == null || fileName.equals(""))
            throw new Exception("파일 이름이 유효하지 않습니다.");
        File f = new File(fileName); // File 클래스의 객체를 만든다
        // File객체이 createNewFiile메서드를 이용해서 실제 파일을 생성한다.
        f.createNewFile();
        return f;
    } // end of creatFile

} // end of class
