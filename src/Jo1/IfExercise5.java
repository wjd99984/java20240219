package Jo1;

public class IfExercise5 {
    public static void main(String[] args) {
        /*
        두개의 정수 변수 a 와 b 를 가지고있다
        a =10 , b=20 이다
        삼향 연산자를 사용하여 두숫자중 더큰숫자를 출력하는
        코드를 작성해보자
         */

        int a = 10;
        int b = 20;

        int max = (a > b) ? a : b;

        System.out.println("더 큰 숫자는 " + max + "입니다");
    }
}
