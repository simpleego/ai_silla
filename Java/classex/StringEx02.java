package com.simple.exam.classex;

import java.time.LocalDate;
import java.util.Locale;

public class StringEx02 {
    public static void main(String[] args) {
        // 각자의 주민번호를 입력하여
        // 나이, 성별, 태어난 곳

        // 020625-4403619
        // 성별 1,2(~1999), 3,4(2000~)

        // 2024-2002 => 22살
        // 성별 : 여자
        // 지역 : 대전

        String id = "020625-4403619";
        // Java 1.8(8) 이후
        LocalDate now = LocalDate.now();
        int year = now.getYear();
        int birthYear = 0;
        String gender_ = "";

        char gender = id.charAt(7);
        switch (gender) {
            case '1':
                gender_ = "남자";
                birthYear = 1990 + Integer.parseInt(id.substring(0, 2));
                break;
            case '2':
                gender_ = "여자";
                birthYear = 1990 + Integer.parseInt(id.substring(0, 2));
                break;
            case '3':
                gender_ = "남자";
                birthYear = 2000 + Integer.parseInt(id.substring(0, 2));
                break;
            case '4':
                gender_ = "여자";
                birthYear = 2000 + Integer.parseInt(id.substring(0, 2));
                break;
        }

        int age = year - birthYear;
        String code = id.substring(8, 10);

        System.out.println("나이 : " + age);
        System.out.println("성별 : " + gender_);
        System.out.println("지역코드 : " + code);
    }
}