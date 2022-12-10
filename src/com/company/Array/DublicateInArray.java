package com.company.Array;

import java.util.Scanner;

public class DublicateInArray {
    public static int dublicate(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        int x=array.length;
        int sum2=(x-1)*(x-2)/2;
        return sum-sum2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println(dublicate(array));

    }
}
