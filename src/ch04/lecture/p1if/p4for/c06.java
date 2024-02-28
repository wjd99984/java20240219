package ch04.lecture.p1if.p4for;

public class c06 {
    public static void main(String[] args) {
        int size = 5; // 오망성의 크기

        // 윗부분 출력
        for (int i = 0; i < size; i++) {
            for (int j = size - i; j > 1; j--) {
                System.out.print(" "); // 공백 출력
            }
            for (int j = 0; j <= i * 2; j++) {
                System.out.print("*"); // 별 출력
            }
            System.out.println(); // 줄 바꿈
        }

        // 아랫부분 출력
        for (int i = size - 1; i > 0; i--) {
            for (int j = 0; j < size - i; j++) {
                System.out.print(" "); // 공백 출력
            }
            for (int j = i * 2; j > 1; j--) {
                System.out.print("*"); // 별 출력
            }
            System.out.println(); // 줄 바꿈
        }
    }
}
