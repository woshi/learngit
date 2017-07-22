package com.cn.ziqidev.sort;

import java.util.Arrays;

/**
 * Created by Administrator on 2017/7/22.
 */
public class BubbleSort {
    public static void sort(int[]nums){
        int start =0;
        int end = nums.length-1;

        while(start<end){
            int temp = nums[end];
            for(int i = 0;i<end;i++){
                if(temp<nums[i]){
                    nums[end] = nums[i];
                    nums[i] = temp;
                    temp = nums[end];
                }
            }

            end--;
        }
    }
    public static void main(String[] args) {
        int[] nums = {5,1,3,4,6,2};
        sort(nums);
        System.out.println(Arrays.toString(nums));
    }

}
