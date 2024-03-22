package ch17.sec11;

import java.util.Arrays;
import java.util.List;

public class ReductionExample {
    public static void main(String[] args) {
        List<Student> studentsList = Arrays.asList(
                new Student("홍줌양", 92),
                new Student("하양이", 95),
                new Student("노랭이", 88)
        );
        int sum1 = studentsList.stream()
                .mapToInt(Student::getScore)
                .sum();

        int sum2 = studentsList.stream()
                .map(Student::getScore)
                .reduce(0, (a, b) -> a + b);

        System.out.println("sum1 = " + sum1);
        System.out.println("sum2 = " + sum2);
    }

}
