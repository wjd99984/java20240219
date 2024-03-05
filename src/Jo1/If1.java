package Jo1;

public class If1 {
    public static void main(String[] args) {
       /*
       문제 당신은 연령에따라 다른 메시지를 출력하는 프로그램작성해야함
       이프로그램은 int arg 라는 변수를 사용해야하며
       연령에따라 다음을 출력해야함

       7세이하면 미취학
       8세이상 13세이하일경우 초등학생
       14~16세 이하일경우 중학생
       17~19세 이하이면 고등학생
       20세 이상일경우 성인
            if 문사용하여 코드작성
        */
        int arg = 17;

        if (arg < 7) {
            System.out.println("미취학입니다");
        } else if (arg <= 13) {
            System.out.println("초등학생입니다");
        } else if (arg <= 16) {

            System.out.println("중학생입니다");
        } else if (arg <= 19) {
            System.out.println("고동학생");
        } else {
            System.out.println("성인입니다");
        }

        /*
        else if
        if 문을 더욱더 간결하세 검사하고 묶어줄수있음
         */


    }
}
