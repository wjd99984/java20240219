package src.ch06.sec06.exam03;

public class Calculator {

    void powerOn() {
        System.out.println("전원을 켭니다");
    }

    void powerOff() {
        System.out.println("전원을 끕니다");
    }

    int plus(int x, int y) {
        int result = x + y;
        return result;
    }

    double divide(int x, int y) {
        double result = (double) x / (double) y;
        return result;
    }

}
