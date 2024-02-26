package ch04.lecture.p1if.p1;

import org.w3c.dom.ls.LSOutput;

public class C02Else {

    // else : if () 조건이 false 일떄 실행되는 코드블럭의 정의

    public static void main(String[] args) {
        boolean condition = true;

        if (condition) {
            System.out.println("statement 1");
            System.out.println("statement 2");
        } else {
            //if 조건의 false 일떄 실행
            System.out.println("statement 3");
            System.out.println("statement 4");
        }

    }
}
