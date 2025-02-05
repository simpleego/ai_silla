package com.simple.exam.fileio;

import java.io.*;

public class TextFileCopyEx {
    public static void main(String[] args) {
        File source = new File("c:/simple/cat.jpg");
        File target = new File("c:/temp/cat1.jpg");

        int c;
        try {
            FileReader fileReader = new FileReader(source);
            FileWriter fileWriter = new FileWriter(target);
            while ( (c = fileReader.read()) != -1){
                fileWriter.write(c);
            }
            fileReader.close();
            fileWriter.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("파일 복사가 완료되었습니다.");
    }
}