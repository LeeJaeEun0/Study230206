package Ch11_Collections_Framework;

import java.util.*;

public class Ex11_2 {
    public static void main(String[] args) {
        Stack st = new Stack<>();
        Queue q = new LinkedList();

        st.push("0");
        st.push("1");
        st.push("2");

        q.offer("0");
        q.offer("1");
        q.offer("2");

        System.out.println("= Stack =");
        while (!st.empty()) { // 비었는지 확인
            System.out.println(st.pop()); // 스택요소를 하나하나 꺼내서 출력
        } // end of while

        System.out.println("= Queue =");
        while (!q.isEmpty()) { // 비었는지 확인
            System.out.println(q.poll());
        } // end of while

    } // end of main
} // end of class
