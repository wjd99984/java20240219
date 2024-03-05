package Jo1;

public class IfExercise2 {
    public static void main(String[] args) {
        /*
        환율 계산하기
        특정 금액을 미국 달러에서 한국 원으로 변화하는
        프로그램 작성
        환율은 1달러당 1300이라 가정

        달러가 0미만이면 잘못된금액입니다
        달러가 0일떄 환전할 금액이없습니다
        달러가 0초과일떄 환전금액은 ( 계산된 원화 금액)원입니다

        금액은 변수 int dollar 로 지정 하고 해당 변수 기반으로
        한국원으로 환전금액 출력
          */
        int dollar = 18;
        int won = dollar * 1300;
        if (dollar < 0) {
            System.out.println("잘못된 금액입니다");
        } else if (dollar == 0) {
            System.out.println("환전할 금액이 없습니다 ");
        } else {
            System.out.println("환전할금액은:" + won + "원입니다");
        }

    }
}
