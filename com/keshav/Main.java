package com.company;

import java.util.Scanner;
import java.util.*;

public class Main {

    public static boolean BinarySearch(int arr[],int x) {
        int l = 0;
        int r = arr.length - 1;
        while (l <= r) {
            int m=(l+r)/2;
            if(arr[m]==x) return true;
            if(arr[m]<x) l=m+1;else r=m-1;
        }
        return false;
    }

    public static void main(String[] args) {
        // write your code here
        Scanner ss=new Scanner(System.in);
        int n=ss.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=ss.nextInt();
        }
        System.out.println("Find x");
        int x=ss.nextInt();
        Arrays.sort(arr);
        boolean truth=BinarySearch(arr,x);
        System.out.println(truth);
    }
}
