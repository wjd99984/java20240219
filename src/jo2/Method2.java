package jo2;

public class Method2 {
    public static void main(String[] args) {
        boolean result = odd(3);
        System.out.println(result);
    }

    public static boolean odd(int i) {
        if (i % 2 == 1) {
            return true;
        } else {
            return false;
        }
    }
}
