package com.devix.www;

public class Main {

    public static void main(String[] args) {

        String a = "A";
        String b = "B";
        int s = 0;
        varags(a,b);
    }

    static void varags(Integer... x) {
        System.out.println("Integer...");
    }

    static void varags(String... x) {
        System.out.println("String...");
    }
}
