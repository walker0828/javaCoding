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
        for(int i=0; i< source.length -1 ;i++) {
            for(int j= 0; j < source.length - 1 -i;j++){
                if( arr[i] < arr[j]) {
                    swap(arr[i],arr[j]);
                }
            }
        }
        return arr;
    }

    private void swap(int i, int j) {
        int temp = i;
        i = j;
        j = i;
    }

    public void main(String[] args) {
        System.out.println("");
    }
}