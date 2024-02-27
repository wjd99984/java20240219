package bookEX.sec06;

public class B017 {

    // 십의 자리 이하를 버리는코드 변수 value 의값이 356 이라면
    // 300이 나올수 있도록 코드를 작성 하세요 ( 산술연산자만 사용가능 )
    public static void main(String[] args) {
        int value = 356;
        value = value / 100 * 100;
        System.out.println("value = " + value);

    }
}
