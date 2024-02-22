package c03.lecture.plarithemetic.p5ternary;

public class C01Ternary {
    public static void main(String[] args) {
        // 삼항 연산자 ( Ternary Operator, 조건연산자 , Conditional operator
        // 피연산자 갯수 3개
        // 기호 :  ?:
        // 문법 
        //피연산자 1? 피연산자 2 : 피연산자3
        // 피연사1이 true 결과값이2,  false 결과값3
        //연산 결과 값은 : 피연사자2 또는 피연산자3


        int r1 = true ? 1 : 2;
        System.out.println("r1 = " + r1);

        int r2 = false ? 1 : 2;
        System.out.println("r2 = " + r2);

        int age = 30;
        String r3 = (age >= 20) ? "어른" : "아이";
        System.out.println("r3 = " + r3);

        age = 15;
        String r4 = (age >= 20) ? "성인" : "미성년자";
        System.out.println("r4 = " + r4);
    }
}
