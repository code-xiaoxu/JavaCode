package com.xuxi.sort;

import java.util.Arrays;

public class SelectSort {
    /**
     * 选择排序
     *
     * @param args
     *
     *
     */
    public static void main(String[] args) {
         int [] arr = {100,25,70,10,1,50,30,40,60};
         selectSort(arr);
        System.out.println("排序结果为");
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 思路分析
     * 从第一个数开始，比较后面的数，如果后面的数小于前面的数，则交换位置，直到找到最小的数，与第一个数交换位置
     * 循环进行，直到n-1个数字排序完成
     * 因为前n-1数已经为当前最小，所以最后一个数排序
     * @param arr
     */
    public static void selectSort(int[] arr){
        int min = 0;
        int minindex = 0;
        for(int i = 0;i<arr.length-1;i++){
            min = arr[i];
            minindex = i;
            for (int  j =i+1;j<arr.length;j++){
                if(min>arr[j]){
                    min = arr[j];
                    minindex  = j;
                }
            }
            if(minindex !=i) {
                arr[minindex] = arr[i];
                arr[i] = min;
            }
            System.out.println("第"+(i+1)+"次排序结果为："+Arrays.toString(arr));
        }
    }
}
