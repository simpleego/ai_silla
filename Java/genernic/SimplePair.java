package com.simple.exam.genernic;

public class SimplePair<T> {
    private T data1;
    private T data2;

    SimplePair(T data1, T data2){
        this.data1 = data1;
        this.data2 = data2;
    }

    public T getFirst(){
        return data1;
    }

    public T getSecond(){
        return data2;
    }

    public void setFirst(T data1){
        this.data1 = data1;
    }

    public void setSecond(T data2){
        this.data2 = data2;
    }

    public static void main(String[] args) {
      SimplePair<String> pair =  new SimplePair<>("apple","tomato");

        System.out.println(pair.getFirst());

        SimplePair<Integer>  pair1 = new SimplePair<>(100,200);
        System.out.println(pair1.getSecond());
    }

}
