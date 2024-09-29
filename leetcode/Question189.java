package leetcode;

public class Question189 {
    /**
     * 189. 轮转数组
     * 给定一个整数数组 nums，将数组中的元素向右轮转 k 个位置，其中 k 是非负数。
     *
     *  解题思路 ：数组反转
     */
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5, 6, 7};
        int[] res = fun(nums, 0, nums.length - 1);
        int k = 3;
        int[] res11 =fun(res, 0, k - 1);
        int[] res1 = fun(res11, k, nums.length-1);
        for (int i : res1) {
            System.out.print(i+" ");
        }
    }
    static int[] fun(int[] nums,int start,int end){
        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
        return nums;
    }

}
