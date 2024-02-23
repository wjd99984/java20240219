package ch02.lecture.p02type;

public class C031FormatString {
    public static void main(String[] args) {

//        int v1 = 1;
//        System.out.println("v1:" + v1);
//        if (true) {
//            int v2 = 2;
//            if (true) {
//                int v3 = 2;
//                System.out.println("v1:" + v1);
//                System.out.println("v2 = " + v2);
//                System.out.println("v3 = " + v3);
//            }
//            System.out.println("v1 = " + v1);
//            System.out.println("v2 = " + v2);
//            System.out.println("v2 = " + v3);
//        }
//        System.out.println("v1 = " + v1);
//        System.out.println("v2 = " + v2);


        String name = "길동";
        String job = "도적";
        System.out.printf("%6d | %-10s | %-10s\n", 1, name, job);

        System.out.println(STR."\{1} | \{name} + \{job}");


        // FMT Template Processor
//        System.out.println(FMT."%6d\{1} | %-10s \{name} |  %-10s\{job}");

////        7-3  8-2 11-9 13  16 9-1

    }
}
