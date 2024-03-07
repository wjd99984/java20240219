package Jo1;

public class ArrayEX1 {
    public static void main(String[] args) {
       /*
        int student1 = 90;
        int student2 = 85;
        int student3 = 80;
        int student4 = 70;
        int student5 = 60;

        int total = student1 + student2 + student3 + student4 + student5;
        double average = (double) total / 5;

        System.out.println("점수총합 " + total);
        System.out.println("점수평균 " + average);

        배열로 바꿔서 풀어
        */

        int[] students = {90, 85, 80, 70, 60};
        int total = 0;
        for (int student : students) {
            total += student;
        }
        double average = total / 5;
        System.out.println("점수총합 " + total);
        System.out.println("점수평균 " + average);

    }
}
