package com.xuxi.sort;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int [] arr = {3,9,-1,10,20};
        System.out.println("-----优化前-----");
        sort(arr);
        int [] arr1 = {3,9,-1,10,20};
        System.out.println("-----优化后-----");
        bubbleSort(arr1);
    }
    public static void sort(int[] nums){
        int temp = 0;
        for(int i = 0;i<nums.length - 1; i++){
            for(int j = 0;j<nums.length-i-1;j++){
               temp  = nums[j];
                if(nums[j]>nums[j+1]){
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
            System.out.println("第"+(i+1)+"次排序结果为："+Arrays.toString(nums));
        }
    }

    //优化
    // 如果某次排序没有发生数据交换  flag = false，则说明数组已经有序，可以提前结束排序
    public static void bubbleSort(int[] nums){
        int temp = 0;
        boolean flag = false;
        for(int i = 0;i<nums.length - 1; i++){
            for(int j = 0;j<nums.length-i-1;j++){
               temp  = nums[j];
                if(nums[j]>nums[j+1]){
                    flag = true;
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
            System.out.println("第"+(i+1)+"次排序结果为："+Arrays.toString(nums));
            //如果某次排序没有发生数据交换  flag = false，则说明数组已经有序，可以提前结束排序
            if(!flag){
                break;
            }else{
                flag = false;
            }
        }
    }
}
