package c02.lecture.p02type;

public class C030PrintfExample {
    public static void main(String[] args) {
        int value = 123;
        System.out.printf("상품의가격: %d원\n", value);
        System.out.printf("상품의가격: %6d원\n", value);
        System.out.printf("상품의가격: %-6d원\n", value);
        System.out.printf("상품의가격: %06d원\n", value);

        double area = 3.14159 * 10 * 10;
        System.out.printf("반지름이 %d인 원의 넓이:%10.2f\n", 10, area);

        String name = "길동";
        String job = "도적";
        System.out.printf("%6d | %-10s | %-10s\n", 1, name, job);

        String name1 = "두두덩";
        System.out.printf("%6d | %8s ", 1, name1);

        //  %d(정수) , %f(실수) , %s( 문자)
    }
}
