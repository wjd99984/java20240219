package ch04.sec02;

public class SwitchExample {
    public static void main(String[] args) {

        int num = (int) (Math.random() * 6) + 1;

        switch (num) {

            case 1:
                System.out.println("1번이 나왔습니다");
                break;

            case 2:
                System.out.println("2번이 나왔습니다");
                break;

            case 3:
                System.out.println("4번이 나왔습니다");
                break;

            case 5:
                System.out.println("5번이 나왔습니다");
                break;
            //위의 모든 casa 해당되지 않을떄
            default:
                System.out.println("6번이 나왔습니다");
                break; // 마지막이면 생갹 가능
        }
    }
}
