package com.simple.exam.fileio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamEx {

    public static void main(String[] args) {
        byte[] bytes = new byte[6]; // {7,51,3,4,-1,24};

        try {
            FileInputStream fileIn =
                    new FileInputStream("c:\\temp\\test.out");
            int c;
            int n=0;
            while( (c=fileIn.read()) != -1) {
                bytes[n++] = (byte)c;
            }
            for (int i = 0; i < bytes.length; i++) {
                System.out.println(bytes[i]+" ");
            }
            fileIn.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("파일에서 내용을 읽어왔습니다.");
    }
}
