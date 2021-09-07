package com.leetcode;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int z = 0;
        for(int i = 0; i<nums.length; i++) {
            if(nums[i]==0)
                z++;
        }

        while(z>0) {
            for(int i = 0; i<nums.length-1; i++) {
                if(nums[i]==0 && nums[i+1]!=0) {
                    nums[i] = nums[i+1];
                    nums[i+1] = 0;
                }
            }
            z--;
        }
    }
}
