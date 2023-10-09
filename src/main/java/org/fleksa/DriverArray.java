package org.fleksa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class DriverArray {
    public static void main(String[] args) {
        ArrayOperration ao = new ArrayOperration();
        int[] arr1 = ao.readArr();
        ao.dispalay(arr1);
        HashMap<Integer, Integer> map1 = ao.biggestElement(arr1);
        System.out.println("maximum index of array "+map1);
        double sumationArray = ao.sumOfArrayElement(arr1);
        System.out.println(sumationArray);
        System.out.println(ao.averageOfArray(arr1,sumationArray));

    }
}
