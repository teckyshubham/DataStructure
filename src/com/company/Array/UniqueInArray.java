package com.company.Array;

import java.util.Scanner;
//XOR METHOD ^(XOR) OPERATOR
public class UniqueInArray {
    public static int unique(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum =sum^array[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println(unique(array));

    }
}
