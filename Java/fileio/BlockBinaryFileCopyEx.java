package com.simple.exam.fileio;

import java.io.*;

public class BlockBinaryFileCopyEx {
    public static void main(String[] args) {
        File source = new File("c:/simple/cat.jpg");
        File target = new File("c:/temp/cat1.jpg");
        long start = System.currentTimeMillis();

        byte[] buffer = new byte[2048*10];

        try {
            FileInputStream fin = new FileInputStream(source);
            FileOutputStream fout = new FileOutputStream(target);
            while (true){
                int n = fin.read(buffer);
                System.out.println("읽은 바이트 수 : "+n);
                fout.write(buffer,0,n);
                if(n<buffer.length)
                    break;
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