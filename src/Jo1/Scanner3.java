package Jo1;

import java.util.Scanner;

public class Scanner3 {
    public static void main(String[] args) {
        /*
         사용자로부터 음식의 이름 ( foodName)
         가격 ( foodPrice)
         수량 ( food Quantity)
         입력받아  주문한 음식의 총 가격을 계산하고 출력하는
         프로그램 작성

         음식의 총가격을 계산 하세요
         총 가격은 각 음식의 가격 과 수량을 곱한값이며
         이름 변수 totalPrise 저장하세요

         주문정보와 총가격을 출력하세요
         출력형태는 "음식이름 ,수량"개를 주문하셨습니다.
         총가격은 [총가격] 입니다
         \
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("음식의 이름을 알려주세요");
        String foodName = scanner.nextLine();

        System.out.println("음식의 가격을 알려주세요");
        int foodPrise = scanner.nextInt();

        System.out.println("음식의 수량을 알려주세요");
        int foodQuantity = scanner.nextInt();

        int totalPries = foodPrise * foodQuantity;
        System.out.println(foodName + " " + foodQuantity + "개를 주문 하셨습니다");
        System.out.println("총 가격은 = " + totalPries);


    }
}
