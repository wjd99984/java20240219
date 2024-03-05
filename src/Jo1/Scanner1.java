package Jo1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        /*
        사용자로 부터 하나의 정수를 입력받고
        이정수가 홀수인지 짝수인지 판별하는 프로그램을 작성하세요

        ex) 하나의 정수를 입력하세요 4
            입력한 숫자는 짝수입니다
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("하나의 정수를 입력하세요");
        long num = scanner.nextLong();

        if (num % 2 == 0) {
            System.out.println("입력한 숫자는 짝수입니다.");
        } else {
            System.out.println("입력한 숫자는 홀수입니다");
        }

        String num1 = (num % 2 == 0) ? "짝수입니다" : "홀수입니다";
        System.out.println("결과값은 = " + num1);
    }
}
