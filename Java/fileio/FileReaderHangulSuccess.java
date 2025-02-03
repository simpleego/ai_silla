package com.simple.exam.fileio;

import java.io.*;

public class FileReaderHangulSuccess {
    public static void main(String[] args) {
        InputStreamReader in = null;
        FileInputStream fin = null;

        try {
            fin = new FileInputStream("c:\\temp\\hangul.txt");
            in = new InputStreamReader(fin, "UTF-8");
            int c;
            System.out.println("인코딩 문자 집합은 "+ in.getEncoding());
            while ( (c=in.read()) != -1){
                System.out.print((char)c);
            }

        } catch (IOException e) {
            System.out.println("입출력 오류");
            throw new RuntimeException(e);
        } finally {
            try {
                fin.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
