package com.company.Array;

import java.util.Scanner;

public class Sort01 {
    public static void sortO1(int[] array) {
        int start=0;
        int end=array.length-1;
        while(start<end){
            if(array[start]!=0){
                if(array[end]!=1){
                    //swap
                    array[start]=0;
                    array[end]=1;
                }
                end--;
            }else{
                start++;
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        sortO1(array);
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }

    }
}
