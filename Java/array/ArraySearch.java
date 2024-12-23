package com.simple.exam.array;

public class ArraySearch {

    public static void main(String[] args) {

        int[] data = {10,20,30,40,50,5};

        int searchVal = 5;
        boolean searchOK=false;
        int i;
        for (i = 0; i < data.length; i++) {
            if(searchVal == data[i]){
                System.out.println("검색한 값 : "+data[i]);
                System.out.println("검색한 값의 위치 : "+(i+1));
                searchOK=true;
                break;
            }
        }

        System.out.println("i : " +i);
        if(data.length == i){
            System.out.println("못 찾았습니다.");
        }

        if(!searchOK) {
            System.out.println("값이 없습니다.");
        }

    }
}
