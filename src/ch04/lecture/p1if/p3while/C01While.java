package ch04.lecture.p1if.p3while;

public class C01While {

    //while : 반복문의 정의
//    { } 명령문들이 ( ) 괄호의 값이 참이면 실행됨
    //{} 명령문 실핼후 () 괄호로 실행흐름이 넘어감

    // () 괄호의 값이 false 이면 while 다음의 실행흐름으로 넘어감
    public static void main(String[] args) {

        boolean condition = true;

        System.out.println("statement 1");
        while (condition) {
            System.out.println("statement 2");
            System.out.println("statement 3");
        }
        System.out.println("statement 4 ");
    }
}
