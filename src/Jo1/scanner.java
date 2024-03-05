package Jo1;

import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        /*
        이름 나이 입력받고 출력하기
         사용자로 부터 입력받은 이름과 나이를 출력
         출력형태는 "당신의 이름음 [이름] 이고
         나이는 [나이] 입니다 이어야합니다

         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("당신의 이름을 입력하세요");
        String name = scanner.nextLine();

        System.out.print("당신의 나이를 입력하세요");
        int age = scanner.nextInt();

        System.out.println("당신의 이름은 :" + name + "\n" + "당신의 나이는 : " + age);

    }
}
