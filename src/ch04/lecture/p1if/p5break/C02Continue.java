package ch04.lecture.p1if.p5break;

public class C02Continue {
    public static void main(String[] args) {
        // continue : 코드블럭 내의 코드실행 중단 하고
        //            반복문의  ( ) 괄호 흐릉이 넘어감

        boolean b = true;
        while (b) {
            System.out.println("statement 1");
            System.out.println("statement 2");
            System.out.println("statement 3");

            continue;
        }
    }
}
