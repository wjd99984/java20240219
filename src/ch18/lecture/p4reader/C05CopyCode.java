package ch18.lecture.p4reader;

import java.io.*;

public class C05CopyCode {
    public static void main(String[] args) {
        // todo: 텍스트 파일 복사
        // C05CopyCode.java 파일을
        // temp/C05CopyCode.txt 파일로 복사

        // Reader, Writer 활용

        String src = "src/ch18/lecture/p4reader/C05CopyCode.java";
        String des = "temp/C05CopyCode.txt";

        try (FileReader reader = new FileReader(src);
             FileWriter writer = new FileWriter(des);) {
            int character;
            while ((character = reader.read()) != -1) {
                writer.write(character);
            }
            System.out.println("파일 복사");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}