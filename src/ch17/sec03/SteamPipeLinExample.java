package ch17.sec03;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SteamPipeLinExample {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student("홍길동", 10),
                new Student("신용권", 20),
                new Student("유미선", 30)
        );

        double avg = list.stream()
                .mapToInt(Student -> Student.getScore())
                .average()
                .getAsDouble();

        System.out.println("평균점수: " + avg);


        Stream<Student> studentStream = list.stream();
        IntStream scoreStream = studentStream.mapToInt(student -> student.getScore());

        double avg1 = scoreStream.average().getAsDouble();
        System.out.println("평균 점수: " + avg1);

    }
}
