package com.xuxi.search;

import java.util.ArrayList;
import java.util.List;

public class insertValueSearch {
    public static void main(String[] args) {
        int[] arr = {1,8,10,89,100};

        System.out.println(insertValueSearch2(arr,0,arr.length-1,90));

    }
       public static List<Integer> insertValueSearch(int[] arr, int left, int right, int findVal){
        int mid = left+(right-left)*(findVal-arr[left])/(arr[right]-arr[left]);
        if(left>right || findVal<arr[left] || findVal > arr[right]){
            return new ArrayList<>();
        }
        if(findVal>arr[mid]){
            return insertValueSearch(arr,mid+1,right,findVal);
        }else if(findVal<arr[mid]){
            return insertValueSearch(arr,left,mid-1,findVal);
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
    public static int insertValueSearch2(int[] arr, int left, int right, int findVal) {

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
			return insertValueSearch2(arr, mid + 1, right, findVal);
		} else if (findVal < midVal) { // 说明向左递归查找
			return insertValueSearch2(arr, left, mid - 1, findVal);
		} else {
			return mid;
		}

	}
}
