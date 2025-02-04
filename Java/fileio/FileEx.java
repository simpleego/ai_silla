package com.simple.exam.fileio;

import java.io.File;

public class FileEx {
    public static void main(String[] args) {
        File file = new File("c:\\windows\\system.ini");
        System.out.println(file.getPath()+","+file.getParent()+
                ","+file.getName());

        String res="";
        if(file.isFile()) res="파일";
        else if(file.isDirectory()) res="디렉터리";
        System.out.println(file.getPath()
        +res+"입니다.");

        File file1 = new File("c:\\temp\\java_sample");
        if(!file1.exists()){
            file1.mkdir();
        }
        listDirectory(new File("c:\\temp"));
        file1.renameTo(new File("c:\\temp\\javaSample"));
        listDirectory(new File("c:\\temp"));

    }

    private static void listDirectory(File dir) {

        System.out.println("--------"+dir.getPath()+
                "의 서브 리스트입니다.");
        File[] subFiles = dir.listFiles();
        for (int i = 0; i < subFiles.length; i++) {
            File subFile = subFiles[i];
            long time = subFile.lastModified();
            System.out.println(subFile.getName());
            System.out.println("파일크기: "+subFile.length());
            System.out.printf("\t수정한 시간:%tb %td %ta %tT",time,time,time,time);
        }
        //long t = subFiles.

    }
}
