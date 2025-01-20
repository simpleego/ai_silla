package com.simple.exam.genernic;

public class Box{
    private Object data;

    public void set(Object data){
        this.data = data;
    }

    public Object get(){
        return data;
    }

    public static void main(String[] args) {
        Box box = new Box();
        String msg = new String("Hello Data");
        box.set(msg);
        System.out.println(box.get());

        box.set((Integer)100);
        System.out.println(box.get());

        box.set(100.5);
        System.out.println(box.get());

    }
}
