package jo2;

public class Method1 {
    public static void main(String[] args) {
        printHeader();
        printFooter();
    }

    public static void printHeader() {
        System.out.println("= 프로그램을 시작합니다");
    }

    // void 는 반환타입이 없어야됨
    // return 반환타입이 없는경우 스킵할수있음.
    // 자바가 알아서 넣어줌
    public static void printFooter() {
        System.out.println("= 프로그램을 종료합니다 ");
    }
}
