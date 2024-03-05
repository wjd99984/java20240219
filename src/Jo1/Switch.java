package Jo1;

public class Switch {
    public static void main(String[] args) {
        /*
        회원등급에 따라 다른 쿠폰을 발급하는 프로그램 작성해야됨
        이프로그램은 int grade 라는 변수를 사용하며
        회원등급 ( grade) 따라 다음의 쿠폰을 발급해야함

        1등급 쿠폰 1000
        2등급 쿠폰 2000
        3등급 쿠폰 3000

        뒤의 등급이 아닐경우 쿠폰 500

        각쿠폰이 할당된후에는 " 발급받은쿠폰:" + 쿠폰값 출력해야함

         */
        /*
        int grade = 3;

        int coupon;
        if (grade == 1) {
            coupon = 1000;
        } else if (grade == 2) {
            coupon = 2000;
        } else if (grade == 3) {
            coupon = 3000;
        } else {
            coupon = 500;
        }
        System.out.println("발급받은쿠폰:" + coupon + "원");
        */

        int grade = 2;
        int coupon;

        switch (grade) {
            case 1 -> {
                coupon = 1000;
            }
            case 2 -> {
                coupon = 2000;
            }
            case 3 -> {
                coupon = 3000;
            }
            default -> coupon = 500;
        }
        System.out.println("발급받은쿠폰:" + coupon + "원");
    }
}
