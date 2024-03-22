package ch17.exercise.p772.p6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Example {
    public static void main(String[] args) {
        List<Member> list = Arrays.asList(
                new Member("홍길동", 30),
                new Member("신용권", 40),
                new Member("강수상", 26)
        );

        double avg = list.stream()
                .mapToInt(Member::getAge)
                .average()
                .orElse(0);
        System.out.println("평균나이: " + avg);
    }

}
