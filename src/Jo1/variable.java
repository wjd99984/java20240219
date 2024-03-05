package Jo1;

public class variable {
    public static void main(String[] args) {
        // 다음코드를 반복해서 나오는 숫자 4,3 을 다른숫자로 한번에
        // 변경할수있도록 다음을 변수 num1 num2를 사용하여 변경
    /*
        System.out.println(4+3);
        System.out.println(4-3);
        System.out.println(4/3);
        System.out.println(4*3);
        */

        int num1 = 4;
        int num2 = 3;

        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);

        int num3 = 10;
        int num4 = 20;
        int sum = num3 + num4;
        System.out.println("sum = " + sum);

        long longVar1 = 100000000l;
        System.out.println(longVar1);

        boolean booleanVar1 = true;
        System.out.println("booleanVar1 = " + booleanVar1);

    }
}
