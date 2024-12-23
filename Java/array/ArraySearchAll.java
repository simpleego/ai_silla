package com.simple.exam.array;

public class ArraySearchAll {

    public static void main(String[] args) {

        int[] data = {10,5, 20,30,5, 40,50,5};
        int[] searchedData = new int[data.length];

        int searchVal = 9;
        boolean searchOK=false;
        int i;
        int j=0;
        for (i = 0; i < data.length; i++) {
            if(searchVal == data[i]){
                searchedData[j++] = i;
            }
        }

        if(j==0){
            System.out.println("못 찾았습니다.");
        }

        System.out.println("찾은 갯수 :"+j);
        for (int k = 0; k < j; k++) {
            System.out.print(searchedData[k]+" ");
        }
    }
}
