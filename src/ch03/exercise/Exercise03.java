package ch03.exercise;

public class Exercise03 {
    public static void main(String[] args) {
        int pencils = 534;
        int students = 30;

        int pencilsPerStudent = pencils / students;
        System.out.println("pencilsPerStudent = " + pencilsPerStudent); // 534 나누기 30

        int pencilsLeft = pencils % students;
        System.out.println("pencilsLeft = " + pencilsLeft); // 534 나누기30 후 나머지
    }
}
