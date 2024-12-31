package com.simple.exam.classex2;

public class ConstructEx02 {
    private  int count;
    private String model;

    ConstructEx02(){
        count = 1;
        System.out.println("객체 생성시 자동 호출됩니다");
    }

    ConstructEx02(int count) {
        if (count > 0){
            this.count = count;
        }else {
            this.count = 0;
        }
    }

    public ConstructEx02(String model, int count) {
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
        ConstructEx02 count1 = new ConstructEx02();
        ConstructEx02 count2 = new ConstructEx02(2);
        ConstructEx02 count3 = new ConstructEx02("k7",2);

        System.out.println(count1.count);
        System.out.println(count2.count);
        System.out.println(count3);
    }
}
