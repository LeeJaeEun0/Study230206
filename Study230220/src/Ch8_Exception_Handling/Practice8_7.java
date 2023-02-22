package Ch8_Exception_Handling;

import java.util.Scanner;

public class Practice8_7 {
    public static void main(String[] args) {
        // 1~100사이의 임의의 값을 얻어서 answer에 저장한다.
        int answer = (int) (Math.random() * 100) + 1;
        int input = 0; // 사용자 입력을 저장할 공간
        int count = 0; // 시도 횟수를 세기 위한 변수

        do {
            count++;
            System.out.print("1과 100사이의 값을 입력하세요: ");
            try {
                input = new Scanner(System.in).nextInt();
            } catch (Exception e) {
                System.out.println("유효하지 않은 값 입니다! 다시 값을 입력해주세요!");
                continue;
            } // end of try catch

            if (answer > input) {
                System.out.println("더 큰 수를 입력하세요!");
            } else if (answer < input) {
                System.out.println("더 작은 수를 입력하세요");
            } else {
                System.out.println("맞혔습니다.");
                System.out.println("시도횟수는 " + count + "번 입니다");
                break; // do while의 벗어난다.
            } // end of if else
        } while (true);
    } // end of main
} // end of class
