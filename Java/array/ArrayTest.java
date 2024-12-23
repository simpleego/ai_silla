package com.simple.exam.array;

public class ArrayTest {
    public static void main(String[] args) {
        int[] s;

        s = new int[10];

        for(int i=0; i<10; i++){
            s[i] = i+1;
        }

        // 배열에 저장된 값을 꺼내어 모두 합한 결과를 출력하세요.
        int sum = 0;
        for(int i=0; i<10; i++){
            // 배열의 합을 계산
            sum += s[i];
        }

        // 합을 출력
        System.out.println("배열의 합 : "+sum);

        for (int i=0; i<10; i++){
            System.out.print(s[i]+" ");
        }

    }
}
