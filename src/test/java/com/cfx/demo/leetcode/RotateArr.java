package com.cfx.demo.leetcode;

import org.junit.Test;

public class RotateArr {

    @Test
    public void rotate(int[] nums, int k) {
        int[] tem = new int[k];
        for (int i = 0; i < k; i++) {
            tem[i] = nums[nums.length - k + i];
        }

        for (int i = 0; i < nums.length - k; i++) {
            nums[i] = nums[i + k];
        }

    }
}
