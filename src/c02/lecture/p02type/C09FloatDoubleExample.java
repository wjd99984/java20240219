package c02.lecture.p02type;

public class C09FloatDoubleExample {
    public static void main(String[] args) {

        float var1 = 0.1234567890123456789f;
        double var2 = 0.1234567890123456789;
        System.out.println("var1 = " + var1);
        System.out.println("var2 = " + var2);


        //10의 거듭제곱 리터럴
        double var3 = 3e6;
        float var4 = 3e6f;
        //float 4byte 저장
        double var5 = 2e-3;
        System.out.println("var3 = " + var3);
        System.out.println("var4 = " + var4);
        System.out.println("var5 = " + var5);

    }
}
