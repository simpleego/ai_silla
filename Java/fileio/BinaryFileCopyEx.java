package com.simple.exam.fileio;

import java.io.*;

public class BinaryFileCopyEx {
    public static void main(String[] args) {
        File source = new File("c:/simple/cat.jpg");
        File target = new File("c:/temp/cat1.jpg");
        long start = System.currentTimeMillis();

        int c;
        try {
            FileInputStream fin = new FileInputStream(source);
            FileOutputStream fout = new FileOutputStream(target);
            while ( (c = fin.read()) != -1){
                fout.write((byte)c);
            }
            fin.close();
            fout.close();
            // 복사에 걸린시간 측정
            long end = System.currentTimeMillis();
            double second = (end-start)/1000.0;
            System.out.println(source.getPath()+"를 "+ target.getPath()+"로 복사하였습니다.");
            System.out.println("복사하는데 걸린 시간(초) :"+second);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("파일 복사가 완료되었습니다.");
    }
}