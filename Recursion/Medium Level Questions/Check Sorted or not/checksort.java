package Recursion;

import java.util.Scanner;

public class checksort {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter The size = ");
        int n = scn.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter Array element - ");
            array[i] = scn.nextInt();
        }
        System.out.println(checkSorted(n, array));
    }

    public static boolean checkSorted(int n, int[] array)
    {
        if(n == 0 || n == 1)
        {
            return true;
        }
        if(array[n-1] < array[n-2])
        {
            return false;
        }
        return checkSorted(n-1, array);
    }
}