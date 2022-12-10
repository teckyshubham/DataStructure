package com.company.Array;

import java.util.Scanner;

public class ArrangeNumberInArray {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //our code
        int [] array =new int[n];
        int start=0,end=n-1;
        int value=1;
        while(start<=end){
            if(start==end){
                array[start++]=value++;
                break;
            }
            array[start++]=value++;
            array[end--]=value++;
        }
        //print the array
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }


    }
}
