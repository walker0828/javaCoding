package com.example.javacoding.algorithm.sorting;

import java.util.Arrays;

public class quick {
    //快速排序
    public int[] sort(int[] originData) {
        int[] arrays = Arrays.copyOf(originData,originData.length);
        return quickSort(arrays,0,arrays.length-1);
    }

    public int[] quickSort(int[] arrays,int left, int right) {
        if(left < right) {
            int partitionIndex = partition(arrays,left,right);
            quickSort(arrays,left,partitionIndex -1);
            quickSort(arrays,partitionIndex,right);
        }
        return null;
    }

    private int partition(int[] arrays, int left,int right) {
        int pivot = left;
        int index = pivot + 1;
        for(int i= index; i<= right; i++) {
            if(arrays[i] < arrays[pivot]) {
                swap(arrays,i,pivot);
                index++;
            }
        }
        swap(arrays,pivot,index-1);
        return index - 1;
    }

    private void swap(int[] arrays, int i ,int j) {
        int tmp = arrays[i];
        arrays[i] = arrays[j];
        arrays[j] = tmp;
    }

    public static void main(String[] args) {
    }
}