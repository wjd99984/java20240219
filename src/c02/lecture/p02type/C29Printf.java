package c02.lecture.p02type;

public class C29Printf {
    public static void main(String[] args) {
        //System.out.printf( )
        // 파라미터 1개 ( print)와유사
        System.out.printf(" hello world");

        System.out.println();
        //파라미터 2개
        //첫번째 파라미터 문자열에 두번째 세번째, ...파라미터를 포함해서 출력
        System.out.printf("hello %s", "jane");

        System.out.println();
        //파라미터 3개
        System.out.printf("hello %s and %s", "son ", "pack");

        System.out.println();

        System.out.printf(" %s %s - %s", "lee", "kang", "in");

        System.out.println();

        System.out.printf("%1$s %2$s %3$s", "son", "pok", "ion");
        System.out.println();

        System.out.printf(" %s %s %s %1$s", "son", "pack", "om");
        System.out.println();

        System.out.printf("%s", "son");
        System.out.println();

        System.out.printf("%5s", "son");
        System.out.println();
    }
}
