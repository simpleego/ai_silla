package com.simple.exam.exception;

public class DebugEx {
    public static void main(String[] args) {
        int[] value = {1,2,3,4,5};
        int sum = 0;

        for (int i = 0; i < 6; i++) {
            try {
                sum += value[i];
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e.getMessage());
                System.out.println(e.getStackTrace());
                System.out.println("배열크기를 초과하였습니다.");
            }
        }
        System.out.println("sum :" +sum);
        double avg=0.0;
        int count=5;

        try {
            avg = sum / (count-5);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("나눗셈 에러");
        }catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("나눗셈 에러");
        }
        catch (Exception e){
            System.out.println("모르는 에러..");
        }finally {
            // 사용된 자원을 해제하는 용도로 사용한다.
            System.out.println("무조건 실행되는 명령어...");
        }
        System.out.println("평균:"+avg);
    }

}
