package com.simple.exam.fileio;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {
    public static void main(String[] args) {
        FileReader fileReader = null;

        try {
            fileReader = new FileReader("c:\\windows\\system.ini");
            int c;
            while ( (c=fileReader.read()) != -1){
                System.out.print((char)c);
            }

        } catch (IOException e) {
            System.out.println("입출력 오류");
            throw new RuntimeException(e);
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
