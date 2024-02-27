package bookEX.sec06;

public class B016 {
    public static void main(String[] args) {
        int pencils = 534;
        int students = 30;
        // 학생 한명이 가지는 연필 수
        int pencilsPerStudent = pencils / students;
        System.out.println("pencilsPerSutudent = " + pencilsPerStudent);
        int pencilsLeft = pencils % students;
        System.out.println("pencilsLeft = " + pencilsLeft);

    }
}
