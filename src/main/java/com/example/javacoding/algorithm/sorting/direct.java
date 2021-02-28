package com.example.javacoding.algorithm.sorting;

public class direct {
    public static void main(String[] args) {

    }

    /**
     *
     */
    public int[] direct(int[] orginData) {
        for(int i=1; i< orginData.length; i++) {
            for (int j=i; j > 0 ; --j) {
                if(orginData[i] >= orginData[j]) {
                    int tmp = orginData[i];
                    orginData[j] = orginData[i];
                    orginData[i] = tmp;
                }
            }
        }
    }
}