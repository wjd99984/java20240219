package Jo1;

public class IfExercise4 {
    public static void main(String[] args) {
        /*
        String grade 라는 문자열을 만들고
        학점에따라 성취를 출력하는 프로그램을 작성
        각학점은 다음과 같은 성취도 나타냄
      """
       A 탁월한 성과입니다
       B 좋은 성과입니다
       C 주수한 성과입니다
       D 향상이 필요합니다
       F 불합격 입니다
        나머지 잘못된 학점입니다
        """
        switch 문을 사용하여 문제를 해결해보자
         */

        String grade = "C";
        String score;
        switch (grade) {
            case "A" -> score = "탁월한 성과 입니다";
            case "B" -> score = "좋은 성과입니다";
            case "C" -> score = "주수한 성과입니다";
            case "D" -> score = "향상이 필요합니다";
            case "F" -> score = "불합격 입니다";

            default -> score = "잘못된 학점입니다";
        }
        System.out.println("grade: = " + grade + "\n" + "score = " + score);

    }
}
