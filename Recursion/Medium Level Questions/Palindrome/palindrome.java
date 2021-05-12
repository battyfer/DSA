package Recursion;

import java.util.Scanner;

public class palindrome {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter The size = ");
        int n = scn.nextInt();
        int[] array = new int[n];
        System.out.println("Enter elements - ");
        for (int i = 0; i < n; i++) {
            array[i] = scn.nextInt();
        }
        System.out.println(checkPalindrome(n-1, array, 0));
    }

    public static boolean checkPalindrome(int n, int[] array, int a)
    {
       if (array[n] != array[a])
       {
           return false;
       }
       if(n == a)
       {
           return true;
       }
       return checkPalindrome(n-1, array, a+1);
    }
}