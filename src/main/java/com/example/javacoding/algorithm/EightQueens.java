package com.example.javacoding.algorithm;

public class EightQueens {
    int[] result = new int[8];

    public static void main(String[] args) {

    }

    public void cal8Queens(int row) {
        if(row == 8) {
            System.out.printf(String.valueOf(result));
            return;
        }
        for(int column= 0;column < 8 ; column ++) {
            if(isOk(row,column)) {
                result[row] = column;
                cal8Queens(row++);
            }
        }
    }

    private boolean isOk(int row,int column) {
        return false;
    }
}
