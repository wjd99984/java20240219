package ch03.exercise;

public class Exercise06 {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;
        //trun     trun
        System.out.println((x > 7) && (y <= 5)); //trun

        // false   false
        System.out.println((x % 3 == 2) || (y % 2 != 1)); //false
    }
}
