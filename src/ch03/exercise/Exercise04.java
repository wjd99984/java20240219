package ch03.exercise;

public class Exercise04 {
    public static void main(String[] args) {
        int value = 356;
        // 356중 소수점 다버리고 300만 출력하고싶을시

        System.out.println(value / 100 * 100);
        System.out.println(value - (value % 100));
    }
}
