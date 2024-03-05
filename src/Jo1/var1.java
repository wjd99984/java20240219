package Jo1;

public class var1 {
    public static void main(String[] args) {
        /*
      1.  num1,num2,num3, 라는 이름의 세개의 int 변수를 선언
        각각 10,20,30 초기화하세요
      2.  세변의 합을 계산하고 그결과를 sum 이라는이름의 int 변수로 저장하세요
      3. 세변수의 편균을 계산하고 그결과를 average 이라는이름의 int 변수에 저장
            평균 계산시 소수점 이하의 결과는 버림하세요.
      4. sum 과 average 변수의 값을 출력하세요
      5 다했다면 double 문제도 풀어봐라
       각각 실수 1.5 ,2.5,3.5 var 저장
         */

        int num1 = 10;
        int num2 = 20;
        int num3 = 30;

        int sum = num1 + num2 + num3;

        int average = (num1 + num2 + num3) / 3;
        //sum
        System.out.println("sum = " + sum);
        System.out.println("sum = " + average);


        double var1 = 1.5;
        double var2 = 2.5;
        double var3 = 3.5;

        double sum1 = var1 + var2 + var3;
        double average1 = sum1 / 3;
        System.out.println("sum = " + sum1);
        System.out.println("sum = " + average1);

        /* 문제  합격의 범위
        int 형 변수 score 를 선언하세요
        score 가 80점 이사잉고 100이하면 true 를 출력하고
        아니면 false 를 출력하세요
         */

        int score = 75;

        boolean result = score >= 80 && score <= 100;

        System.out.println(result);

    }
}
