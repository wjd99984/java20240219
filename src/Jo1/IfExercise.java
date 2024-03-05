package Jo1;

public class IfExercise {
    public static void main(String[] args) {
        /*
        문제 학정 계산하기
        학생의 점수를 기반으로 학점 출력하는 프로그램 작성

        90이상 "A"
        80점이상90미만 "B"
        70점이상 80미만 "C"
        60점이상 70점미만 "D"
        60미만 "F"

       점수는 변수 inr score 지정하고 해당변수 기반으로 학점출력
         */

        int score = 80;

        if (score >= 90) {
            System.out.println("학점은 A 입니다");
        } else if (score >= 80) {
            System.out.println("학점은 B 입니다");
        } else if (score >= 70) {
            System.out.println("학점은 C 입니다");
        } else if (score >= 60) {
            System.out.println("학점은 D 입니다");
        } else {
            System.out.println("학점은 F 입니다");
        }


    }
}
