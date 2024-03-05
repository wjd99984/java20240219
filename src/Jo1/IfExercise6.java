package Jo1;

public class IfExercise6 {
    public static void main(String[] args) {
         /*
         문제- 홀수 짝수 찾기
         정수 x 가 주어지면 x 가짝수이면 "짝수"
         정수 x 가 홀수이면 "홀수" 를 출력해보자
         삼향 연산자를사용하여 출력하라
          */

        int x = 15;

        String result = (x % 2 == 0) ? "짝수" : "홀수";

        System.out.println(result);
    }
}
