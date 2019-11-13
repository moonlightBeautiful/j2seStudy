package com.java1234.c02basicGrammar;

import java.util.Arrays;

public class ArrayStudy {

    public static void main(String[] args) {
        int arr[] = {1, 7, 3, 8, 2};

        /**
         * Arrays.toString(数组)：不改变原数组
         */
        System.out.println("数组" + Arrays.toString(arr));
        /**
         * Arrays.sort(数组)：改变原数组
         */
        Arrays.sort(arr);
        System.out.println("排序后的数组" + Arrays.toString(arr));
        /**
         * Arrays.binarySearch(数组，要搜索的值)：不改变原数组
         */
        System.out.println(Arrays.binarySearch(arr, 1));
        /**
         * Arrays.fill(数组，要填充的值,[startIndex],[endIndex])：变原数组
         */
        Arrays.fill(arr, 0); //数组全部填值为0
        System.out.println("填值后的数组" + Arrays.toString(arr));
    }
}
