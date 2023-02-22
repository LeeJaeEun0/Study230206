package Ch11_Collections_Framework;

import java.util.*;

public class Ex11_1 {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList(10);
        // ArrayList에는 객체만 저장가능
        // list1.add(5); // 가능한 이유: autoboxing에 의해 기본형이 참조형으로 자동변환

        list1.add(new Integer(5));
        list1.add(new Integer(4));
        list1.add(new Integer(2));
        list1.add(new Integer(0));
        list1.add(new Integer(1));
        list1.add(new Integer(3));

        // list2는 list1의 값 중 일부만 뽑아냄
        // subList를 통해 만들면 읽기만 가능
        ArrayList list2 = new ArrayList<>(list1.subList(1, 4));
        // ArrayList sub = list1.subList(1,4); // 1~3
        // ArrayList list2 = new ArrayList(sub);

        print(list1, list2); // print메소드 사용

        Collections.sort(list1); // list1, list2를 오름차순 정렬
        Collections.sort(list2);
        print(list1, list2);

        System.out.println("list1.containsAll(list2)" + list1.containsAll(list2));

        list2.add("B");
        list2.add("C");
        list2.add(3, "A"); // 인덱스가 3인 곳에 A를 추가
        print(list1, list2);

        list2.set(3, "AA"); // 인덱스가 3인 곳을 AA로 변경
        print(list1, list2);

        list1.add(0, "1");
        // indexOf()는 지정된 객체의 위치(인덱스)를 알려준다.
        System.out.println("String Type의 \"1\"의 index = " + list1.indexOf("1"));
        System.out.println("int Type의 1의 index = " + list1.indexOf(1));
        System.out.println("int Type의 1의 index = " + list1.indexOf(new Integer(1)));
        list1.remove(0); // 인덱스가 0번인 경우 삭제
        list1.remove(new Integer(1)); //숫자 1이 삭제 => 인덱스가 아닌 요소의 값으로 삭제

        // list1에서 list2와 겹치는 부부만 남기고 나머지는 삭제한다.
        System.out.println("list1.retainAll(list2)" + list1.retainAll(list2));

        print(list1, list2);

        // list1에서 list2에 포함된 객체들을 삭제한다.
        for (int i = list2.size() - 1; i >= 0; i--) {
            if (list1.contains(list2.get(i)))
                list2.remove(i); // 인덱스가 i인 곳에 저장된 요소를 삭제
        } // end of for i
        print(list1, list2);
    } // end of main

    // 메소드를 정의하지 않으면 오류 발생
    // The method print(ArrayList, ArrayList) is undefined for the type Ex11_1
    static void print(ArrayList list1, ArrayList list2) {
        System.out.println("list1 : " + list1);
        System.out.println("list2 : " + list2);
        System.out.println();
    } // end of print()
} // end of class
