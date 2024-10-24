package com.xuxi.search;

import java.util.ArrayList;
import java.util.List;

// 二分查找
//前提数组必须有序
public class BinarySearch {
    public static void main(String[] args) {
        int [] arr = {1,8,10,89,1000,1000,1000,1000,1000};
//        System.out.println(binarySearch(arr,0,arr.length-1,9));
        System.out.println(binarySearch_pro(arr,0,arr.length-1,1000));
    }

    /**
     *
     * @param arr
     * @param left
     * @param right
     * @param findVal
     * @return
     */
    public static int binarySearch(int[] arr,int left,int right,int findVal){
        int mid = (left+right)/2;
        if(left>right){
            return -1;
        }
        if(findVal>arr[mid]){
            return binarySearch(arr,mid+1,right,findVal);
        }else if(findVal<arr[mid]){
            return binarySearch(arr,left,mid-1,findVal);
        }else{
            return mid;
        }
    }
    public static List<Integer> binarySearch_pro(int[] arr, int left, int right, int findVal){
        int mid = (left+right)/2;
        if(left>right){
            return new ArrayList<Integer>();
        }
        if(findVal>arr[mid]){
            return binarySearch_pro(arr,mid+1,right,findVal);
        }else if(findVal<arr[mid]){
            return binarySearch_pro(arr,left,mid-1,findVal);
        }else{
            List<Integer> list = new ArrayList<>();
            int temp = mid-1;
            while(temp>=0 && findVal == arr[temp]){
                list.add(temp);
                temp--;
            }
            list.add(mid);
             temp = mid+1;
            while(temp<=arr.length-1 && findVal == arr[temp]){
                list.add(temp);
                temp++;
            }
            return list;
        }
    }
    public static int insertValueSearch(int[] arr, int left, int right, int findVal) {

		System.out.println("插值查找次数~~");

		//注意：findVal < arr[0]  和  findVal > arr[arr.length - 1] 必须需要
		//否则我们得到的 mid 可能越界
		if (left > right || findVal < arr[0] || findVal > arr[arr.length - 1]) {
			return -1;
		}

		// 求出mid, 自适应
		int mid = left + (right - left) * (findVal - arr[left]) / (arr[right] - arr[left]);
		int midVal = arr[mid];
		if (findVal > midVal) { // 说明应该向右边递归
			return insertValueSearch(arr, mid + 1, right, findVal);
		} else if (findVal < midVal) { // 说明向左递归查找
			return insertValueSearch(arr, left, mid - 1, findVal);
		} else {
			return mid;
		}

	}

}
