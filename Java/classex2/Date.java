package com.simple.exam.classex2;

public class Date {
    private int year;
    private String month;
    private int day;

    public int getYear() {
        return year;
    }

    public String getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    Date(){
        this(2024,"1월",30);
    }
    Date(int year){
        this(year,"1월",30);
    }

    Date(int year, int day){
        this(year,"1월",day);
    }

    Date(int year, String month, int day) {
        this.year = year;
        this.month = month;
        if(day >=1 && day <=31){
            this.day = day;
        }
    }

    public static void main(String[] args) {
        Date date = new Date();
        Date date1 = new Date(2024);
        Date date2 = new Date(2024,11);

        System.out.println(date.getYear()+date.getMonth()+
                date.getDay());

    }
}
