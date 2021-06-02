package Recursion;

import java.util.Arrays;
import java.util.Scanner;

public class Bubble_Sort {

    public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
        System.out.println("Enter the Number of numbers - ");
        int n = scn.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scn.nextInt();
        }
       sort(array, 0, n-1);
       System.out.println(Arrays.toString(array));
    }

    public static void sort(int[] array, int index, int end)
    {
        int temp;
        if(index == end)
        {
            return;
        }
        if(array[index] > array[index + 1])
        {
            temp = array[index];
            array[index] = array[index + 1];
            array[index + 1] = temp;
        }
        if(index + 1 != end)
        {
            sort(array, index + 1, end);
        }
        sort(array, 0, end - 1);
    }
}