package ch03.lecture.plarithemetic.p2assignment;

public class C01Assignment {
    public static void main(String[] args) {
        // assignment operator (할당연산자 , 대입 연산자 )
        // 기호: =
        //오른쪽값을 왼쪽에 대입 (할당, assign)
        //연산 순서는 오른쪽 부터
        // 연산의 우선 순위 105p
        // 우선 순위가 낮다

        int a = 3;
        int b = 5;
        int c = b;
        int d = c = 7;

        int e = (c = b) + 1;

        int f = c = b + (1 + a);
        System.out.println("e = " + e);
        System.out.println("f = " + f);

    }
}
