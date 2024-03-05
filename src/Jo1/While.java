package Jo1;

public class While {
    public static void main(String[] args) {
        /*
        문제 
        1부터 하나씩 증가하는 수를 3번더해라 
        ex 1+2+3
        while 문 사용한것 + 사용안한것 둘다
         */
        int sum = 0;

        sum = sum + 1;
        System.out.println("sum = " + sum);
        sum = sum + 1;
        System.out.println("sum = " + sum);
        sum = sum + 1;
        System.out.println("sum = " + sum);

        System.out.println("----------------------");

        int sum1 = 0;
        int i = 1;
        int endNum = 100;
        while (i <= endNum) {
            sum1 = sum1 + i;
            System.out.println(i + " " + sum1);
            i++;
        }
    }
}
