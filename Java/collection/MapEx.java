package com.simple.exam.collection;

import java.util.HashMap;
import java.util.Map;
class Student {
    int number;
    String name;

    public Student(int number, String name) {
        this.number = number;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "number=" + number +
                ", name='" + name + '\'' +
                '}';
    }
}


public class MapEx {
    public static void main(String[] args) {
     Map<String, Student>  student =  new HashMap<String,Student>();

     student.put("20090001", new Student(20090001,"구준표"));
     student.put("20090002", new Student(20090002,"금잔디"));
     student.put("20090003", new Student(20090003,"윤지후"));

        System.out.println(student);

        // 맵에서 데이터 추출
        System.out.println(student.remove("20090001"));

        System.out.println(student);

        student.put("20090002", new Student(1234,"홍길동"));
        System.out.println(student);
        System.out.println(student.get("20090003"));

        for (Map.Entry<String, Student> s : student.entrySet()){
            String key = s.getKey();
            Student value = s.getValue();
            System.out.println("key="+key+","+"value="+value);
        }

    }
}
