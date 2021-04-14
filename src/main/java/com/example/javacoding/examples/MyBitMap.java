package com.example.javacoding.examples;

public class MyBitMap {
    private byte[] bytes;

    private int initSize;

    public MyBitMap(int size) {
        if(size <= 0) {
            return ;
        }
        initSize = size / (8) +1;
        bytes = new byte[initSize];
    }

    public void set(int number) {
        int temp = number >> 3;
    }

    public boolean contain(int number){
        return false;
    }

    public static void main(String[] args) {
        MyBitMap myBitMap = new MyBitMap(32);
        myBitMap.set(19);
    }
}
