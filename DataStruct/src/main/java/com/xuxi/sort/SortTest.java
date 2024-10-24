package com.xuxi.sort;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class SortTest {
    public static void main(String[] args) {
//          int [] arr1 = {100,25,70,10,1,50,30,40,60};
//        System.out.println("原始数组："+Arrays.toString(arr1));
//
//        System.out.println("冒泡排序：");
//        bubbleSort(arr1);
//         int [] arr2 = {100,25,70,10,1,50,30,40,60};
//        System.out.println("插入排序：");
//        insertSort(arr2);
//         int [] arr3 = {100,25,70,10,1,50,30,40,60};
//        System.out.println("选择排序：");
//        selectSort(arr3);
//        int [] arr4 = {100,25,70,10,1,50,30,40,60};
//        System.out.println("希尔排序：");
//        shellSort(arr4);


        int[] arr = new int[8000000];
		for (int i = 0; i < 8000000; i++) {
			arr[i] = (int) (Math.random() * 8000000); // 生成一个[0, 8000000) 数
		}

		System.out.println("排序前");
		Date data1 = new Date();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String date1Str = simpleDateFormat.format(data1);
		System.out.println("排序前的时间是=" + date1Str);

		shellSort(arr);

		Date data2 = new Date();
		String date2Str = simpleDateFormat.format(data2);
		System.out.println("排序前的时间是=" + date2Str);
    }
    public static void bubbleSort(int[] arr){
        boolean flag = false;
        int temp = 0;
        for(int i=0;i<arr.length;i++){
            for(int j = 0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }
            System.out.println("第"+(i+1)+"轮排序后："+ Arrays.toString(arr));
            if(flag){
                flag = false;
            }else {
                break;
            }
        }
    }
    public static void selectSort(int[] arr){
        int minValue = 0;
        int minIndex = 0;
        for(int i=0;i<arr.length-1;i++){
            minValue = arr[i];
            minIndex = i;
            for(int j=i+1;j<arr.length;j++){
                if(minValue>arr[j]){
                    minValue = arr[j];
                    minIndex = j;
                }
            }
            if(minIndex!=i){
                arr[minIndex] = arr[i];
                arr[i] = minValue;
            }
            System.out.println("第"+(i+1)+"轮排序  ："+Arrays.toString(arr));
        }

    }
    public static void insertSort(int[] arr){
        int insertValue = 0;
        int insertIndex = 0;
        for(int i=1;i<arr.length;i++){
            insertValue = arr[i];
            insertIndex = i-1;
            while(insertIndex >= 0 && insertValue<arr[insertIndex]){
                arr[insertIndex+1] = arr[insertIndex];
                insertIndex--;
            }
            insertIndex++;
            arr[insertIndex] = insertValue;
            System.out.println("第"+(i+1)+"轮排序结果为"+ Arrays.toString(arr));
        }

    }
    public static void shellSort(int[] arr){
        int temp = 0;
        int index = 0;
        for(int grap = arr.length/2;grap>0;grap = grap/2){
            for(int i =grap;i<arr.length;i++){
                temp = arr[i];
                index = i-grap;
                while(index >= 0 && temp < arr[index]){
                    arr[index+grap] = arr[index];
                    index = index - grap;
                }
                index = index +grap;
                arr[index] = temp;
            }
//            System.out.println("步长为"+grap+"的分组："+Arrays.toString(arr));
        }
    }

}
