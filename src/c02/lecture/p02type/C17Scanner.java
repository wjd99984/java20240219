package c02.lecture.p02type;

import javax.sound.sampled.Line;
import java.util.Scanner;

public class C17Scanner {
    public static void main(String[] args) {

        //Scanner 키보드입력으로 입력하는객체

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a line: ");
        String line = scanner.nextLine();  //키보드 입력받음

        System.out.println("Line = " + line);

    }
}
