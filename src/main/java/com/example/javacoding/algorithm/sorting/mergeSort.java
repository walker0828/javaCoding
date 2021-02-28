package com.example.javacoding.algorithm.sorting;

public class mergeSort {
    public static void mergeSort(int[] arr) {
        int[] temp = new int[arr.length];
        internalMergeSort(arr,temp,0,arr.length-1);
    }

    public static void internalMergeSort(int[] arr, int[] temp, int left, int right) {
        if(left < right) {
            int mid = (left + right)/2;
            internalMergeSort(arr,temp,left,mid);
            internalMergeSort(arr,temp,mid+1,right);
            mergeSortedArray(arr,temp,left,mid,right);
        }
    }

    public static void mergeSortedArray(int[] arr, int[] temp, int left, int mid, int right) {
        int i = left;
        int j = mid + 1;
        int k = 0;

        while(i <= mid && j <= right){
            temp[k++] = arr[i] < arr[j] ? arr[i++] : arr[j++];
        }

        while(i <= mid) {
            temp[k++] = arr[i++];
        }

        while(j <= right) {
            temp[k++] = arr[j++];
        }

        for(i=0; i< k ; i++) {
            arr[left+i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{9,8,7,6,5,4,3,2,1};
        mergeSort(array);
        System.out.println(array);
    }
}