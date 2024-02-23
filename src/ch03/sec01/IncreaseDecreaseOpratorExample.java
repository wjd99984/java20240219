package ch03.sec01;

// 80쪽
public class IncreaseDecreaseOpratorExample {
    public static void main(String[] args) {
        int x = 10;
        int y = 10;
        int z;

        x++;
        ++x;
        System.out.println("x = " + x);

        System.out.println("------------------");
        y--;
        --y;
        System.out.println("y = " + y);

        System.out.println("------------------");
        z = x++;
        System.out.println("z = " + z);
        System.out.println("x = " + x);

        System.out.println("------------------");
        z = ++x;
        System.out.println("z = " + z);
        System.out.println("x = " + x);

        System.out.println("------------------");
        z = ++x + y++;
        System.out.println("z = " + z);
        System.out.println("x = " + x);
        System.out.println("y = " + y);


    }
}
