package ch04.lecture.p1if.p2switch;

public class C02Switch {
    public static void main(String[] args) {
        // break 생갹시 코드는 계속 실행됨

        System.out.println("statement 1");

        String city = "seoul";

        switch (city) {
            case "seoul":
                System.out.println("statement 2");
                break;
            case "busan":
                System.out.println("statement 3");
                break;
            case "jeju":
                System.out.println("statement 4");
                break;
        }
        System.out.println("statement 5");

    }
}
