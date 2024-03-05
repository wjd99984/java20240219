package Jo1;

public class IfExercise1 {
    public static void main(String[] args) {
        /*
        주어진 거리에 따라 가장 적합한 운송수단을
        선택하는 프로그램 작성

        거리가 1km 이하면 "도보"
        거리가 10km 이하면 "자전거"
        거리가 100km 이하면 "자동차"
        거리가 100km 초과이면 "비행기"

        변수 int distance 로 지정하고 해당변수 기반으로 운송수단 출력

         */
        int distance = 111;

        if (distance <= 1) {
            System.out.println("도보");
        } else if (distance <= 10) {
            System.out.println("자전거");
        } else if (distance <= 100) {
            System.out.println("자동차");
        } else {
            System.out.println("비행기");
        }
    }
}
