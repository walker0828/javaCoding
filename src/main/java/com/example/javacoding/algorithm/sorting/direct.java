package com.example.javacoding.algorithm.sorting;

public class direct {
    /**
     *  直接插入排序
     */
    public void direct(int[] orginData) {
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