package src.ch06.sec06.exam05;

public class Computer {

    int sum(int... values) {
        int sum = 0;

        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }

        return sum;
    }
}

class ComputerExample {
    public static void main(String[] args) {

        Computer myCom = new Computer();

        int result1 = myCom.sum(1, 2, 3);
        System.out.println("result1 = " + result1);

        int result2 = myCom.sum(1, 2, 3, 4, 5);
        System.out.println("result2 = " + result2);

        int[] value = {1, 2, 3, 4, 5};
        int result3 = myCom.sum(value);
        System.out.println("result2 = " + result3);

        int result4 = myCom.sum(new int[]{1, 2, 3, 4, 5});
        System.out.println("result2 = " + result4);


    }
}
