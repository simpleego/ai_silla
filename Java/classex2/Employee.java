package com.simple.exam.classex2;

public class Employee {
    private String name;
    private double salary;

    private static int count=0;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        count++;
    }

    protected void finalize(){
        count--;
        System.out.println("직원이 소멸되었습니다."+count);
    }

    public static int getCount(){
        return count;
    }

    public static void main(String[] args) {
        Employee e1, e2, e3;
        e1 = new Employee("홍길동",100);
        e2 = new Employee("최수동",300);
        e3= new Employee("김철호",500);

        System.out.println("직원 수 : "+Employee.getCount());
        e1.finalize();

    }
}
