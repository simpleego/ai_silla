package com.simple.exam.array;

import java.util.Scanner;

public class MovieReservation {
    public static void main(String[] args) {
        final int SIZE = 10;
        int a;
        int[] seats = new int[SIZE];
        int seatNumber;

        Scanner kbd = new Scanner(System.in);

        while (true) { // for(;;)
            // 좌석표 보이기
            showSeats(seats);
            System.out.print(" 원하시는 좌석번호를 입력하세요(종료는 -1) : ");
            seatNumber = Integer.parseInt(kbd.nextLine());

            if(seatNumber == -1) {
                break;
            }

            if(seats[seatNumber-1] == 0){
                seats[seatNumber-1] = 1;
                System.out.println("좌석 예약되었습니다.");
            }else {
                System.out.println("이미 예약되었습니다.");
            }

        }
    }

    private static void showSeats(int[] seats) {
        System.out.println(">> 영화 좌석예약 시스템 <<");
        for (int i = 0; i < seats.length; i++) {
            System.out.print("--");
        }
        System.out.println();
        for (int i = 0; i < seats.length; i++) {
            System.out.print((i+1)+" ");
        }
        System.out.println();

        for (int i = 0; i < seats.length; i++) {
            System.out.print(seats[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < seats.length; i++) {
            System.out.print("--");
        }
        System.out.println();
    }
}
