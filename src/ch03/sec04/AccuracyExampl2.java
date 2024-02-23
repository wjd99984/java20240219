package ch03.sec04;

public class AccuracyExampl2 {
    public static void main(String[] args) {
        int apple = 1;
        int totalpieces = apple * 10;
        int number = 7;

        int result = totalpieces - number;
        System.out.println("10 조각에서 남은조각 = " + result);
        System.out.println("사과 1개에서 남은양 = " + result / 10.0);
    }
}
