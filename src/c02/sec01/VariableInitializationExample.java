package c02.sec01;

public class VariableInitializationExample {
    public static void main(String[] args) {
        int value;
        value=10;
//        int result = value +10;
       System.out.println(value);
       int hour =3;
       int minute = 5;
        System.out.println(hour + "시간" + minute + "분");

        int totalMinute = (hour*60) +minute;
        System.out.println("총" + totalMinute + "분");
    }
}
