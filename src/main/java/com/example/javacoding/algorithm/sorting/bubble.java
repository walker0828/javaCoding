package com.example.javacoding.algorithm.sorting;

import java.util.Arrays;

class bubble {
    /**
     * 时间复杂度 n2
     * 空间复杂度
     * 在输入已经是正序的时候最快，输入的数据都是反序的时候最慢
     * */
    public int[] bubbleSort(int[] source){
        int[] arr = Arrays.copyOf(source,source.length);
        for(int i =1; i < source.length ; i++) {
            boolean flag = true;
            for(int j = 0; j< source.length - 1; j++){
                if (arr[j] < arr[j+1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                    flag = true;
                }
            }

            if(flag) {
                break;
            }
        }
        return arr;
    }

    public void main(String[] args) {
        System.out.println("");
    }
}