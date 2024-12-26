package com.simple.exam.array;

public class CommandLineArg {
    public static void main(String[] args) {

        if(args.length > 0){
            for (String arg : args) {
                System.out.println(arg);
            }

            if(args[0].equals(("-h"))){
                System.out.println("HELP 출력");
            }
        }
    }
}
