package com.simple.exam.classex2;

public class AccessControlEx01Test {
    public static void main(String[] args) {
        AccessControlEx01 acceccObj = new AccessControlEx01();
        acceccObj.b = 100;
        int num = acceccObj.b;

        System.out.println("b ="+num);
    }

}
