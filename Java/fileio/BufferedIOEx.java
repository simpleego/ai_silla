package com.simple.exam.fileio;

import java.io.BufferedOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class BufferedIOEx {
    public static void main(String[] args) {
        FileReader fileReader = null;

        try {
            fileReader = new FileReader("c:\\temp\\test2.txt");
            int c;
            BufferedOutputStream out = new BufferedOutputStream(System.out,10);
            while ( (c=fileReader.read()) != -1){
                out.write(c);
                //System.out.print((char)c);
            }
            new Scanner(System.in).nextLine();
            out.flush();
            fileReader.close();
            out.close();

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
