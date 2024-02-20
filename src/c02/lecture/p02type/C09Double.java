package c02.lecture.p02type;

public class C09Double {
    public static void main(String[] args) {
        double a = 0.1;
        double b = 0.2;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        // d연산시 원하지 않는 결과값이 나올수도 있다
        double c = a + b;
        System.out.println("c=" + c);

        // BigDecimal 사용해서 문제해결 가능
    }
}
