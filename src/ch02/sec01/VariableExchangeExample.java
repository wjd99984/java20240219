package ch02.sec01;

public class VariableExchangeExample {
    public static void main(String[] args) {
//        int x=3;
//        int y=5;
//        System.out.println("x:"+x+"y:"+y);
//
//        int temp = x;
//        x=y;
//        y= temp;
//        System.out.println("x:"+x+"y:"+y);


        int a = 600;
        int b = 300;
        System.out.println("a:" + a + "b:" + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("a:" + a + "b:" + b);

    }
}
