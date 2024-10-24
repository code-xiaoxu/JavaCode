package com.xuxi.sort;

import java.util.Arrays;

public class ShellSort {

    public static void main(String[] args) {
        int [] arr = {100,25,70,10,1,50,30,40};
//        shellSortToExchange(arr);
            shellSortToMove(arr);
    }

    public static void shellSortToExchange(int[] arr) {
        int temp = 0;
        int count = 0;
        for (int grap = arr.length / 2; grap > 0; grap = grap / 2) { //不同步长

            for (int i = grap; i < arr.length; i++) {      //步长为grap的分组

                for (int j = i - grap; j >= 0; j = j - grap) { //比较，然后交换值
                    if (arr[j] > arr[j + grap]) {
                        temp = arr[j];
                        arr[j] = arr[j + grap];
                        arr[j + grap] = temp;
                    }
                }
            }
            System.out.print("第" + (++count) + "轮排序：");
            System.out.println(Arrays.toString(arr));
        }
    }

    public static void shellSortToMove(int[] arr) {

        for (int grap = arr.length / 2; grap > 0; grap = grap / 2) { //不同步长

            for (int i = grap; i < arr.length; i++) {      //步长为grap的分组
                int j = i;
                int temp = arr[j];
                while(j -grap >=0 && temp < arr[j-grap]){
                    arr[j] = arr[j-grap];
                    j = j - grap;
                }
                arr[j] = temp;
            }
            System.out.println("步长为"+grap+"的分组："+Arrays.toString(arr));
        }
    }
}
