package ch03.lecture.plarithemetic.p1Arithmetic;

public class C05Double {
    public static void main(String[] args) {
        double a = 0.1;
        double b = 0.2;
        double c = a + b;
        System.out.println("c = " + c);

        //해결책 1 BigDecimal 객체사용

        //해결책 2  정수로 바꿔서 연산 

        int d = (int) (a * 10);
        int e = (int) (b * 10);
        int f = d + e;
        double g = f / 10.0;
        System.out.println("g = " + g);


    }
}
