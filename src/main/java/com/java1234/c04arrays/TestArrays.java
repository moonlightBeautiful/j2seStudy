package com.java1234.c04arrays;

import java.util.Arrays;

public class TestArrays {

    public static void main(String[] args) {
        int arr[] = {1, 7, 3, 8, 2};
        System.out.println(arr);
        System.out.println("数组" + Arrays.toString(arr));
        Arrays.sort(arr); // 排序数组
        System.out.println("排序后的数组" + Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(arr, 1));
        Arrays.fill(arr, 0); //数组全部填值为0
        System.out.println("填值后的数组" + Arrays.toString(arr));

    }
}
