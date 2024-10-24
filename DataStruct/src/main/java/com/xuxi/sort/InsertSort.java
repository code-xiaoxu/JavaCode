package com.xuxi.sort;

import java.util.Arrays;

public class InsertSort {
    /*
    * 插入排序
    * 插入排序是直接插入排序，也称直接插入排序，也称简单插入排序，也称插入排序，
    *
    * 思想
    * 1.从第一个元素开始，该元素可以认为已经被排序
    * 2.取出下一个元素，在已经排序的元素序列中从后向前扫描
    * 3.如果该元素小于被比较的元素，则将该元素插入到该元素原来位置上，被比较元素后移一位
    *
     */
    public static void main(String[] args) {
     int [] arr = {100,34,56,21};
     insertSort(arr);
    }
    public static void insertSort(int[] arr){
        int insertValue = 0;
        int insertIndex = 0;
        for(int i = 1;i<arr.length;i++){
            insertValue = arr[i];
            insertIndex =i-1;
            while(insertIndex >=0 && insertValue < arr[insertIndex]){  // 如果插入的元素小于它的前一个元素
                arr[insertIndex+1] = arr[insertIndex];   // 则将前一个元素后移
                insertIndex--;
            }
            arr[insertIndex+1] = insertValue;
            System.out.println("第"+(i+1)+"次排序结果为"+ Arrays.toString(arr));
        }
    }
}
