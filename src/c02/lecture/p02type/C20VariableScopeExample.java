package c02.lecture.p02type;

import java.util.Scanner;

public class C20VariableScopeExample {
    public static void main(String[] args) {
        int v1 = 15;
        if (v1 > 10) {
            int v2 = v1 - 10;
            int v3 = v1 + v2 + 5;
        }
        //int v3 = v1+ v2 +5; //v2 사용이 안되서 불가
    }
}
