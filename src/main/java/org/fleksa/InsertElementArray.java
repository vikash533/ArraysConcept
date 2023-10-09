package org.fleksa;

import java.util.Arrays;
import java.util.Scanner;

public class InsertElementArray {
    public static void main(String[] args) {
        System.out.println("Enter the size of Array");
        Scanner sc = new Scanner(System.in);
        int length =sc.nextInt();
        int arr [] = new int[length];
        System.out.println("enter the "+length+" elements");
        int i;
        for (i=0;i<arr.length;i++){
            arr [i]=sc.nextInt();
        }
        System.out.println("Array before reversing");
        System.out.println(Arrays.toString(arr));
        for (int j=arr.length-1;j>=0;j--){
            System.out.println(arr[j]);
        }
    }



}
