package com.simple.exam.fileio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx {

    public static void main(String[] args) {
        byte[] bytes={7,51,3,4,-1,24};

        try {
            FileOutputStream fileOut =
                    new FileOutputStream("c:\\temp\\test.out");
            for (int i = 0; i < bytes.length; i++) {
                fileOut.write(bytes[i]);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("파일에 저장하였습니다.");
    }
}
