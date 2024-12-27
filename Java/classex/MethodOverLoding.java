package com.simple.exam.classex;
class MyMath{
    int square(int i){
        return i*i;
    }

    double square(double d){
        return d*d;
    }
}

public class MethodOverLoding {
    public static void main(String[] args) {
        MyMath myMath = new MyMath();

        int result = myMath.square(10);
        System.out.println("결과 :" + result);

        double result1 = myMath.square(10.5);
        System.out.println("결과 :" + result1);
    }
}
