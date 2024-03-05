package Jo1;

public class Ifc {
    public static void main(String[] args) {
        /*
        문제
        온라인 쇼핑몰 할인 시스템을 개발해야한다
        한사용자가 어떤 상품을 구매할떄
        다양한 할인조건에따라
        총 할인금액이 달라질수있따
        각각의 할인 조건은 다음과 같다

        아이템 가격이 10000원 이상일떄 1000원할인
        나이가 10살이하일떄 1000원할인

         */

        int price = 10000;
        int arg = 10;
        int discount = 0;

        if (price >= 10000) {
            discount = discount + 1000;
            System.out.println("10000원 이상 구매시, 1000원 할인 ");
        }
        if (arg <= 10) {
            discount = discount + 1000;
            System.out.println("나이가 10살이하일떄 천원할인 ");
        }
        System.out.println("총 할인 금액 :" + discount + "원");


    }
}
