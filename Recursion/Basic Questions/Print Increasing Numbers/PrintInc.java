package Recursion;

import java.util.Scanner;

public class PrintInc {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter The Number till which you want to print = ");
        int n = scn.nextInt();
        print_Inc(n);
    }

    public static void print_Inc(int n)
    {
        if(n<1)
        {
            return;
        }
        print_Inc(n-1);
        System.out.println(n);
    }

}