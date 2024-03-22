package ch18.sec882;

import ch08.exercise.p6.Soundable;

import java.io.*;
import java.util.zip.InflaterInputStream;

public class Ex10 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("원본 파일 경로를 입력하세요");
            String strFilePath = reader.readLine();
            File Filepath = new File(strFilePath);

            if (!Filepath.exists()) {
                System.out.println("원본 파일이 존재하지않습니다");
                return;
            }

            System.out.println("복사 파일 경로를 입력하세요);");
            String copyFilepath = reader.readLine();
            File copyFile = new File(copyFilepath);

            File parentDirectory = copyFile.getParentFile();
            if (!parentDirectory.exists()) {
                if (parentDirectory.mkdir()) {
                    System.out.println("디렉토리 생성" + parentDirectory.getAbsolutePath());
                } else {
                    System.err.println("디렉토리 생성 실패: " + parentDirectory.getAbsolutePath());
                }
            }
         

            FileInputStream fis = new FileInputStream(Filepath);
            BufferedInputStream bis = new BufferedInputStream(fis);
            FileOutputStream fos = new FileOutputStream(copyFile);
            BufferedOutputStream bos = new BufferedOutputStream(fos);

            byte[] data = new byte[1024];
            int bytesRead;
            while ((bytesRead = bis.read(data)) != -1) {
                bos.write(data, 0, bytesRead);
            }
            bis.close();
            bos.close();

            System.out.println("복사가 성공 되었습니다");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

