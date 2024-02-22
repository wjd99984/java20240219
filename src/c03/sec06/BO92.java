package c03.sec06;

public class BO92 {
    public static void main(String[] args) {
        /*영문 대문자 :65~90
         * 영문소문자는 97~122
         * 숫자 48~57*/
        int charCode = 'A';

        if ((65 <= charCode) & (charCode <= 90)) {
            System.out.println("대문자 이군요");
        }

        if ((97 <= charCode) && (charCode <= 90)) {
            System.out.println("소문자 이군요");
        }
        if ((48 <= charCode) && (charCode <= 57)) {
            System.out.println("0~9 숫자 이군요");
        }

//        System.out.println(----------------------);

        int value = 6;
        if ((value % 2 == 0) | (value % 3 == 0)) {
            System.out.println("2or3의 배수이군요");
        }
        boolean result = (value % 2 == 0) || (value % 3 == 00);
        if (!result) {
            System.out.println("2or3의 배수가 아니군요");
        }

    }
}
