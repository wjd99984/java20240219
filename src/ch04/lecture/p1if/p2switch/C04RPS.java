package ch04.lecture.p1if.p2switch;

import java.util.Random;
import java.util.Scanner;

public class C04RPS {
    public static void main(String[] args) {
        // 가위바위보 게임 만들기
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("가위(1), 바위(2), 보(3) 를 선택하세요:");

        // 1, 2, 3
        int user = Integer.parseInt(scanner.nextLine());
        int computer = random.nextInt(1, 4);
        // 여러분들이 코드 작성
        switch (user) {
            case 1 -> System.out.println("user = 가위 ✌️");
            case 2 -> System.out.println("user = 바위 ✊");
            case 3 -> System.out.println("user = 보 ✋");
        }

        switch (computer) {
            case 1 -> System.out.println("computer = 가위 ✌️");
            case 2 -> System.out.println("computer = 바위 ✊");
            case 3 -> System.out.println("computer = 보 ✋");
        }

        //누가 이겼는지? 또는 비겼는지 메세지 출력
        if (user == computer) {
            System.out.println("비겼습니다. ");
        } else if (user == 1 && computer == 3) {
            System.out.println("사용자가 이겼습니다. 🎉");
        } else if (user == 2 && computer == 1) {
            System.out.println("사용자가 이겼습니다. 🎉");
        } else if (user == 3 && computer == 2) {
            System.out.println("사용자가 이겼습니다. 🎉");
        } else {
            System.out.println("사용자가 졌습니다. 😭");
        }


    }
}
