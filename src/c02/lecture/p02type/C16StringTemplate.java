package c02.lecture.p02type;

import static java.lang.String.format;
import static java.lang.StringTemplate.STR;

public class C16StringTemplate {
    public static void main(String[] args) {
        //자바 21 부터 사용가능
        // string template
        String name = "jom";
        String age = "50";
        // my name is jom and age is 50

        String desc1 = "my name is" + name + "and age is " + age;
        System.out.println(desc1);

        String desc2 = format("my name is %s and age is %s", name, age);
        System.out.println(desc2);

        String desc3 = STR."my nams is\{name} and age is \{age}";
        System.out.println(desc3);


        String address = "서울";
        String country = "한국";
        // 저는 한국에 삽니다

        String desc4 = STR."저는 \{country}에있는 \{address}에서 삽니다";
        System.out.println(desc4);
    }
}
