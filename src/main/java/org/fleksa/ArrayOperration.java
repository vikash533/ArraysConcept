package org.fleksa;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

//write a program to show entered elements of array,find biggest elements and sum of the array and average of array
public class ArrayOperration {

    //Read Array element
    public int[] readArr(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        System.out.println("Enter "+size+" Elements of Array");
        int arr []= new int[size];
        for (int i =0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        return arr;
    }
    //display array
    public int [] dispalay(int [] arr123) {
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
        System.out.println(Arrays.toString(arr123));
        return  arr123;
    }

    public HashMap<Integer, Integer> biggestElement(int [] a){

        //int big =a[0];
        int maxIndex =0;
        for (int i =0;i<a.length;i++){
            if(a[maxIndex]<a[i]){
                maxIndex=i;
            }
        }
//        ArrayList <Integer> list = new ArrayList<>();
//        list.add(maxIndex);
//        list.add(a[maxIndex]);
//        return list;
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        map.put(maxIndex,a[maxIndex]);
        return  map;

    }
    public double sumOfArrayElement(int [] ar){
        double sum =0;
        for (int i=0;i<ar.length;i++){
            sum = sum+ar[i];
        }

        return sum;
    }
    public double averageOfArray(int [] ar, double sum){
        int lengthOfArray = ar.length;
        double average = sum/lengthOfArray;
        return average;
    }
}
