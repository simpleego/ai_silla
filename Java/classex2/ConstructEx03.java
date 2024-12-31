package com.simple.exam.classex2;

public class ConstructEx03 {
    private  int count;
    private String model;

    ConstructEx03() {
    }

    ConstructEx03(int count) {
        if (count > 0){
            this.count = count;
        }else {
            this.count = 0;
        }
    }

    public ConstructEx03(String model, int count) {
        this.model = model;
        this.count = count;
    }

    @Override
    public String toString() {
        return "ConstructEx02{" +
                "count=" + count +
                ", model='" + model + '\'' +
                '}';
    }

    public static void main(String[] args) {
        ConstructEx03 count1 = new ConstructEx03();
        ConstructEx03 count2 = new ConstructEx03(2);
        ConstructEx03 count3 = new ConstructEx03("k7",2);

        System.out.println(count1.count);
        System.out.println(count2.count);
        System.out.println(count3);
    }
}
