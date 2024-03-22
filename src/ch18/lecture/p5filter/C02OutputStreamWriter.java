package ch18.lecture.p5filter;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class C02OutputStreamWriter {
    public static void main(String[] args) throws Exception {
        String file = "output2.txt";
        OutputStream os = new FileOutputStream(file);

        OutputStreamWriter osw = new OutputStreamWriter(os);

        // OutputStreamWriter
        // 문자 단위 출력 스트림을 바이트 단위출력 스트림 연결
        char c1 = 'A';
        osw.write(c1);

        char c2 = '가';
        osw.write(c2);

        os.close();
    }
}
