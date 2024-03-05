package Jo1;

public class CondOp {
    public static void main(String[] args) {
        int age = 10;
        String status;
        if (age >= 18) {
            status = "성인입니다";
        } else {
            status = "미성년자 ";
        }
        System.out.println("age = " + age + "\n" + "status = " + status);


        int age1 = 18;
        String status1 = (age1 >= 18) ? "성인" : "미성년자";
        System.out.println("age = " + age1 + "\n" + "status1 = " + status1);
    }
}
