package Recursion;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter The Number = ");
        int n = scn.nextInt();
        System.out.println(fibo(n));
    }

    private static int fibo(int n) {
        if(n < 2)
        {
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }

}