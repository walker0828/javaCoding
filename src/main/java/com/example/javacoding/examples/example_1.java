package com.example.javacoding.examples;

public class example_1 {
    // 翻转一个long类型数字。例如输入123456L，输出654321L。
    // Leetcode翻转integer的变种。考察能否正确处理溢出的情况。
    public long reverse(long origin){
        long result = 0;
        while(true) {
            long n = origin%10;
            result = result*10 + n;
            n = n/10;
            if(n == 0L) {
                break;
            }
        }
        return result;
    }

    // 输入一个double，要求返回与它最接近的.49或.99的数字。
    // 例如12.77返回12.99，11.02返回10.99，12.61返回12.49。
    public double feedback(double data) {
        return data;
    }

    // 有三个线程ABC分别向一个数组中写入a，l，i，要求最终的写入结果形如alialiali...写入次数由A线程决定。
    public void threadExample() {

    }
}
