package Recursion;

import java.util.Scanner;

public class pattern {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter The Number = ");
        int n = scn.nextInt();
        print(n);
    }

    public static void print(int n)
    {
        if(n == 0)
        {
            return;
        }
        printstring(n);
        System.out.println();
        print(n-1);
    }

    public static void printstring(int n)
    {
        if (n == 0)
        {
            return;
        }
        System.out.print("*");
        printstring(n-1);
    }
}