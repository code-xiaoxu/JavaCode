package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question88 {
    /**
     * 给你两个按 非递减顺序 排列的整数数组 nums1 和 nums2，另有两个整数 m 和 n ，分别表示 nums1 和 nums2 中的元素数目。
     *
     * 请你 合并 nums2 到 nums1 中，使合并后的数组同样按 非递减顺序 排列。
     *
     * 注意：最终，合并后数组不应由函数返回，而是存储在数组 nums1 中。为了应对这种情况，nums1 的初始长度为 m + n，
     * 其中前 m 个元素表示应合并的元素，后 n 个元素为 0 ，应忽略。nums2 的长度为 n 。
     */

    static void merge(int[] nums1, int m, int[] nums2, int n) {
        List<Integer> list =new ArrayList<>();
        for(int i=0;i<m;i++){
            list.add(nums1[i]);
        }
        for(int i=0;i<n;i++){
            list.add(nums2[i]);
        }
        list.sort((o1, o2) -> o1-o2);
        list.forEach(System.out::println);
    }

    static void merge2(int[] nums1, int m, int[] nums2, int n) {
        int[] arr =new int[m+n];
        for(int i=0;i<m;i++){
            arr[i]=nums1[i];
        }
        for(int i=0;i<n;i++){
           arr[i+m]=nums2[i];
        }
        Arrays.sort(arr);
        for(int i : arr){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,0,0,0};
        int[] arr2 = {2,5,6};
        merge2(arr1,3,arr2,3);
    }
}
