package c02.lecture.p02type;

public class C12BooleanExample {
    public static void main(String[] args) {
        boolean aol = true;
        if (aol) {
            System.out.println("중지합니다");
        } else {
            System.out.println("시작합니다");
        }

        int x = 10;
        boolean result1 = (x == 20);
        boolean result2 = (x != 20);
        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);

    }
}
