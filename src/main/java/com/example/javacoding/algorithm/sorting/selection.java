package com.example.javacoding.algorithm.sorting;

import java.util.Arrays;

// 选择最小的数 放到第一位，然后从剩下的数选择 放到第二位
public class selection {
    public void selection(int[] originData) {
        int[] arrays = Arrays.copyOf(originData,originData.length);
        int min_index = 0;
        for(int i = 1 ; i < arrays.length ; i++) {
            if(arrays[i] < arrays[min_index]) {

            }
        }
    }
}