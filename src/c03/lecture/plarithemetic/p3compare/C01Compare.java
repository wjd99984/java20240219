package c03.lecture.plarithemetic.p3compare;

public class C01Compare {
    public static void main(String[] args) {
        //비교연산자
        //==, !=, >,>=, < ,<+
        //연산 결과 : boolean (true ,false)
        // 다른 타입간 연산 가능 ( 하지만 가능하면 같은타입끼리 연산)

        int a = 5;
        int b = 8;
        boolean b1 = a == b;
        System.out.println("b1 = " + b1);
        boolean b2 = a != b;
        System.out.println("b2 = " + b2);
        boolean b3 = a > b;
        System.out.println("b3 = " + b3);
        boolean b4 = a >= b;
        System.out.println("b4 = " + b4);
    }
}
