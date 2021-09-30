package com.company;

public class Main {


    public static boolean isSquare(int x) {
        int n = (int) Math.sqrt(x);
        int r = Math.round(n) * Math.round(n);
        return r == x;

    }

    public static void main(String[] args) {
        int x = 16;
        if (isSquare(x)) System.out.println("Полный квардрат");

        else System.out.println("Неполный квардрат");


    }
}
