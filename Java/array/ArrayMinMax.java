package com.simple.exam.array;

public class ArrayMinMax {
    public static void main(String[] args) {
        int[] tvPrices = {4000,10000,20000,13000,4000,15000,20000};
        int maxPrice;
        int minPrice;

        minPrice = tvPrices[0];
        for (int i = 1; i < tvPrices.length; i++) {
            if( minPrice > tvPrices[i] ){
                minPrice = tvPrices[i];
            }
        }
        // 최소가격 출력
        System.out.println("최소가격 : "+minPrice);

        maxPrice = tvPrices[0];
        for (int i = 1; i < tvPrices.length; i++) {
            if( maxPrice < tvPrices[i] ){
                maxPrice = tvPrices[i];
            }
        }

        // 최대가격 출력
        System.out.println("최대가격 : "+maxPrice);
    }
}
