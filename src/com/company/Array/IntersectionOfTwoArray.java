package com.company.Array;

import java.util.*;

public class IntersectionOfTwoArray {
    public static void intersection(int[] array1,int []array2) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<array1.length;i++){
            if(!map.containsKey(array1[i])){
                map.put(array1[i],1);
            }else{
                map.put(array1[i],map.get(array1[i])+1);
            }
        }
        for(int i=0;i<array2.length;i++){
            if(map.containsKey(array2[i])){
                System.out.println(array2[i]);
            }
        }
//        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] array1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            array1[i] = sc.nextInt();
        }
        int n2=sc.nextInt();
        int []array2=new int[n2];
        for(int i=0;i<n2;i++){
            array2[i]=sc.nextInt();
        }
        intersection(array1,array2);

    }
}
