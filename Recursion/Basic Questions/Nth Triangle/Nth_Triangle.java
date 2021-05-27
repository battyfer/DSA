package Recursion;

import java.util.Scanner;

public class Nth_Triangle {

    public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
       System.out.println("Enter Number - ");
       int n = scn.nextInt();
        System.out.println(sum(n));
    }

    public static int sum(int n)
    {
        if(n == 1)
        {
            return 1;
        }
        return n + sum(n-1);
    }

}