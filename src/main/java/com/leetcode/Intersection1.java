package com.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Intersection1 {
    public int[] intersection1(int[] nums1, int[] nums2) {  //95.29
        Set<Integer> set = new HashSet<Integer>();
        int index=0;
        for(int i:nums1)
            set.add(i);

        for(int i : nums2)
        {
            if(set.contains(i))
            {
                nums1[index++] = i;
                set.remove(i);
            }
        }
        return Arrays.copyOfRange(nums1,0,index);
    }
}
