package com.simple.exam.classex2;

import java.util.ArrayList;

public class GameCharacter {
    private class GameItem {
        String name;
        int type;
        int price;

        int getPrice() {
            return price;
        }

        @Override
        public String toString() {
            return "GameItem{" +
                    "name='" + name + '\'' +
                    ", type=" + type +
                    ", price=" + price +
                    '}';
        }
    }

    private ArrayList<GameItem> list = new ArrayList<>();

    public void add(String name, int type, int price) {
        GameItem item = new GameItem();
        item.name = name;
        item.type = type;
        item.price = price;
        list.add(item);
    }

    public void print() {
        int total = 0;

        for (GameItem item : list) {
            System.out.println("아이템 : " + item);
            total += item.getPrice();
        }

        System.out.println("아이템의 총가격: " + total);
    }
}