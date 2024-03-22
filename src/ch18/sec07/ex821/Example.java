package ch18.sec07.ex821;

import ch08.sec10.exam01.B;
import ch18.sec07.exam01.BufferExample;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;

public class Example {
    public static void main(String[] args) throws Exception {
        String filePath = "src/ch18/sec07/ex821/Example.java";

        FileReader fr = new FileReader(filePath);
        BufferedReader br = new BufferedReader(fr);

        int rowNumber = 0;
        String rowData;
        while (true) {
            rowData = br.readLine();
            if (rowData != null) {
                rowNumber++;
                System.out.println(rowNumber + ":" + rowData);
            } else {
                break;
            }
        }
        br.close();
        fr.close();
    }
}
