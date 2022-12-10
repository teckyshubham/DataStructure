package com.company.Array;

import java.util.Scanner;

public class LinearSearch {

    public static int linearSearch(int[] array,int x) {
//        int sum = -1;
        for (int i = 0; i < array.length; i++) {
//            sum += array[i];
            if(array[i]==x){
                return x;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x=sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println(linearSearch(array,x));

    }
}
