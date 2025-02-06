package com.simple.exam.network;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ClientEx {
    public static void main(String[] args) throws IOException {
        BufferedReader in = null;
        BufferedWriter out = null;

        Socket socket = null;
        Scanner scanner = new Scanner(System.in);

        socket = new Socket("localhost", 9999);
        in = new BufferedReader(
                new InputStreamReader(
                        socket.getInputStream()));
        out = new BufferedWriter(
                new OutputStreamWriter(
                    socket.getOutputStream()));
        while (true){
            // 서비스 요청
            System.out.println("보내기 >>");
            String outMessage = scanner.nextLine();
            if(outMessage.equalsIgnoreCase("bye")){
                out.write(outMessage+"\n");
                out.flush();
                break;
            }
            out.write(outMessage+"\n");
            out.flush();

            String inputMessage = in.readLine();
            System.out.println("서버: "+inputMessage);
        }

        scanner.close();
        socket.close();
    }
}
