package com.simple.exam.control;

import java.util.Date;
import java.util.Scanner;

public class ExamWelcome {
    public static void main(String[] args) {

        // Good Morning(11), afternoon(15),
        // evening(20), night

        Date date = new Date();
        int currentHour = date.getHours();
        String msg="";

        currentHour = 13;

        System.out.println(currentHour);

        if(currentHour < 11 ){
            msg = "Good Morning";
        } else if (currentHour < 15) {
            msg = "Good afternoon";
        } else if (currentHour < 20) {
            msg = "Good evening";
        } else {
            msg = "Good night";
        }

        System.out.println(msg);
    }
}
