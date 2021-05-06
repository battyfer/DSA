package Recursion;

import java.util.Scanner;

public class PrintDec {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter The Number from which you want to print = ");
        int n = scn.nextInt();
        print_Dec(n);
    }

    public static void print_Dec(int n)
    {
        if(n<1)
        {
            return;
        }
        System.out.println(n);
        print_Dec(n-1);
    }

}
