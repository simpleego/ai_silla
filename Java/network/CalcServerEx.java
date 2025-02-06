package com.simple.exam.network;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.StringTokenizer;

public class CalcServerEx {

    public static String calc(String exp){
        StringTokenizer st = new StringTokenizer(exp," ");
        if(st.countTokens() != 3) return "error";
        String res="";

        // 24 + 50 --> 24(op1)
        int op1 = Integer.parseInt(st.nextToken());

        // 24 + 50 --> +(opCode)
        String opCode = st.nextToken();

        // 24 + 50 --> 50(op2)
        int op2 = Integer.parseInt(st.nextToken());

        switch (opCode){
            case "+": {
                res = String.valueOf(op1+op2);break;
            }
            case "-": {
                res = String.valueOf(op1+op2);break;
            }
            case "*": {
                res = String.valueOf(op1+op2);break;
            }
            case "/": {
                res = String.valueOf(op1+op2);break;
            }
            default: res = "error";
        }
        return res;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader in = null;
        BufferedWriter out = null;

        ServerSocket listener = null;
        Socket socket = null;

        Scanner scanner = new Scanner(System.in);
        listener = new ServerSocket(9999);
        System.out.println(" 연결을 기다리고 있습니다.");
        socket = listener.accept();
        System.out.println("연결이 되었습니다.");

        in = new BufferedReader(
                new InputStreamReader(
                        socket.getInputStream()));
        out = new BufferedWriter(
                new OutputStreamWriter(
                    socket.getOutputStream()));
        while (true){
            // 서버 서비스 구현
            String inputMessage = in.readLine();
            if(inputMessage.equals("bye")){
                System.out.println(" 클라이언트에서 bye로 연결 종료를 요청하였다.");
                break;
            }
            System.out.println("클라이언트 : "+ inputMessage);
            System.out.println("보내기 >>");
            String outMessage = calc(inputMessage);
            out.write(outMessage+"\n");
            out.flush();
        }

        scanner.close();
        socket.close();
        listener.close();
    }
}
