package ch18.sec07.exam01;

import ch08.sec10.exam01.E;

import java.io.*;

public class BufferExample {
    public static void main(String[] args) throws Exception {
        String dogFilePath1 = "temp/dog.png";
        String dogFilePath2 = "temp/dog2.png";

        FileInputStream fis = new FileInputStream(dogFilePath1);
        FileOutputStream fos = new FileOutputStream(dogFilePath2);

        String dogFilePath3 = "temp/dog.png";
        String dogFilePath4 = "temp/dog2.png";
        FileInputStream fis2 = new FileInputStream(dogFilePath3);
        FileOutputStream fos2 = new FileOutputStream(dogFilePath4);
        BufferedInputStream bis = new BufferedInputStream(fis2);
        BufferedOutputStream bos = new BufferedOutputStream(fos2);

        long nonBufferTime = copy(fis, fos);
        System.out.println("버퍼 미사용:\t" + nonBufferTime + "ns");

        long bufferTime = copy(bis, bos);
        System.out.println("버퍼 사용:\t" + bufferTime + "ns");

        fis.close();
        fos.close();
        bis.close();
        bos.close();
    }


    public static long copy(InputStream is, OutputStream os) throws Exception {
        long start = System.nanoTime();
        while (true) {
            int data = is.read();
            if (data == -1) break;
            os.write(data);
        }
        os.flush();
        long end = System.nanoTime();
        return (end - start);
    }
}
