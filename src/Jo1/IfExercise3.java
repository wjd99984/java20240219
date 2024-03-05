package Jo1;

public class IfExercise3 {
    public static void main(String[] args) {
        /*
        문제 평점에 따른 영화 추천하기
        요청한 폄점이상의 영화를 찾아서 추천하는 프로그램 작성하자

        어바웃 타임 -평점9
        토이스토리 -평점8
        고질라 - 평점 7

       평점 변수는 double rating 사용 if문 활용해서 문제 풀자
         */

        double reating = 8.5;

        if (reating <= 9) {
            System.out.println("어바웃 타임");
        }
        if (reating <= 8) {
            System.out.println("토이스토리");
        }
        if (reating <= 7) {
            System.out.println("고질라");
        }
        System.out.println(reating);
    }
}
