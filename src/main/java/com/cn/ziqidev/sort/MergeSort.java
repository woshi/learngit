package com.cn.ziqidev.sort;

import java.util.Arrays;

/**
 * Created by Administrator on 2017/7/22.
 */
public class MergeSort {
    static int count = 0;
    public static void main(String[] args) {
        int[] nums = {5,1,3,4,6,2};
        MergeSort mergeSort = new MergeSort();
        mergeSort.merge(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(count);

    }

    public void merge(int[] nums){
        if(nums.length<2){
            return;
        }
        int end = nums.length-1;
        int mid = end/2;
        int start = 0;
        merge(nums,start,mid,end);

    }
    public void merge(int[]nums,int start,int mid,int end){
        if(end<=start){
            return;
        }
        merge(nums,start,(mid+start)/2,mid);
        merge(nums,mid+1,(end+mid+1)/2,end);
        merge(nums,start,mid,mid+1,end);
    }

    public void merge(int[] nums ,int start,int end,int m,int n){
        int temp[] = new int[nums.length];
        int tempStart = start;
        int mark = start;
        while(start<=end&&m<=n){
            if(nums[start]<nums[m]){
                temp[tempStart++] = nums[start++];
            }else{
                temp[tempStart++] = nums[m++];
                count= count+1+end-start;
            }
        }
        while(start<=end){

            temp[tempStart++] = nums[start++];
        }
        while (m<=n){
            temp[tempStart++] = nums[m++];
        }
        for(;mark<=n;mark++){
            nums[mark] = temp[mark];
        }
        System.out.println(Arrays.toString(nums));
    }
}
