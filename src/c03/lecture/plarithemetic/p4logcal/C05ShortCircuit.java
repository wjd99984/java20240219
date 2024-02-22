package c03.lecture.plarithemetic.p4logcal;

public class C05ShortCircuit {
    public static void main(String[] args) {
        int i = 10;

        boolean b1 = (i++) == 10 || (i++) == 30;
        System.out.println("b1 = " + b1);
        System.out.println("i = " + i);

        i = 10;
        boolean b2 = (i++) == 30 || (i++) == 40;
        System.out.println("b2 = " + b2);
        System.out.println("i = " + i);

        i = 10;
        boolean b3 = (i++) == 10 | (i++) == 30;
        System.out.println("b3 = " + b3);
        System.out.println("i = " + i); // 12
    }
}
