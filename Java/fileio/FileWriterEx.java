package com.simple.exam.fileio;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterEx {
    public static void main(String[] args) {
        FileWriter fileWriter = null;
        Scanner kbd = new Scanner(System.in);

        try {
            fileWriter = new FileWriter("c:\\temp\\test100.txt");
            int c;
            while (true){
                String str = kbd.nextLine();
                if(str.length() == 0)
                    break;
                fileWriter.write(str,0,str.length());
                //fileWriter.write("\r\n",0,2);
            }

        } catch (IOException e) {
            System.out.println("입출력 오류");
            throw new RuntimeException(e);
        } finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        kbd.close();
    }

}
