package Ch12_Generics_Enumeration_Annotation;

import java.util.ArrayList;

public class GenericsTest {
    public static void main(String[] args) {
        // ArrayList list = new ArrayList();
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        //list.add("30"); // Generics를 사용해서 입력한 값이 잘못된 것을 알 수 있음
        list.add(30);

        // Integer i = (Integer) list.get(2); // String타입의 30을 가져와라
        // 컴파일에서 잡지 못해서 실행시 오류 발생한 것을 알 수 있음
        // java.lang.ClassCastException라는 오류 발생 => 형변환 오류
        
        //Integer i = (Integer) list.get(2);
        Integer i = list.get(2); // 형변환 생략가능
    } // end of main
} // end of class
