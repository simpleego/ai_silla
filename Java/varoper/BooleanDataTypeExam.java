package com.simple.exam.varoper;

public class BooleanDataTypeExam {
    public static void main(String[] args) {
        boolean man;

        man = false;
        System.out.println("man : " +man);

        if(man)
            System.out.println("성별"+"남자");

        if(!man)
            System.out.println("성별"+"여자");

        if(man == false)
            System.out.println("성별"+"여자");

        boolean b = (1 > 2);
        if(b)
            System.out.println(" 결과값이 참이다.");

        if(!b)
            System.out.println(" 결과값이 참이다.");

    }
}
