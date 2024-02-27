package ch05.lecture.p1array.exercise;

public class Exercise071 {
    public static void main(String[] args) {
        int[] array = {1, 5, 3, 8, 2};

        int sum = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > sum) {
                sum = array[i];
            }
        }
        System.out.println("sum = " + sum);
    }
}
