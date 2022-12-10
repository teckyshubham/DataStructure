package com.company.Array;

import java.util.Scanner;

public class SwapAlternateElementOfArray {

    public static void swap(int[] array) {
        int sum = 0;
        if(array.length%2==0){
            for (int i = 0; i < array.length; i+=2) {
                int x=array[i];
                array[i]=array[i+1];
                array[i+1]=x;
            }
        }else{
            for (int i = 0; i < array.length-1; i+=2) {
                int x=array[i];
                array[i]=array[i+1];
                array[i+1]=x;
            }
        }
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        swap(array);

    }
}
