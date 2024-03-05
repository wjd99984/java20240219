package codingtest;

public class C03 {
    public static void main(String[] args) {
        int n = 4;
        int sum = 0;

        for (int i = 0; i <= n / 2; i++) {
            sum = sum += n / 2;
        }
        System.out.println(sum);
    }
}
