package com.example.javacoding.leetcode;

public class Test220 {

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4};
        containsNearbyAlmostDuplicate(nums,1,1);
    }

    public static boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        for(int i=0, j=1; i < nums.length -1;j++) {
            if(j == nums.length) {
                i++;
                j = i+1;
            }
            if(Math.abs(nums[i] - nums[j]) <= t && Math.abs(i-j) <= k) {
                return true;
            }
        }
        return false;
    }
}
