package com.example.javacoding;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavacodingApplication {

    public static void main(String[] args) {
        int result = maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4});
        SpringApplication.run(JavacodingApplication.class, args);
    }

    public static int maxSubArray(int[] nums) {
        int pre = 0 , maxAns = nums[0];
        for(int num : nums) {
            pre = Math.max(pre+num, num);
            maxAns = Math.max(maxAns,pre);
        }
        return maxAns;
    }

}
