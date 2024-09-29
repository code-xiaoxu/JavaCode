package leetcode;

public class Question4 {
    /**
     * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
     *
     * 请注意 ，必须在不复制数组的情况下原地对数组进行操作。
     * 输入: nums = [0,1,0,3,12]
     * 输出: [1,3,12,0,0]
     */

    static int[] getRes(int[] nums){
        int j = 0;
        for(int i =0;i<nums.length;i++){
            if(nums[i]!=0){    //012
                nums[j] = nums[i];

                j++;
            }
        }
        for(int i =j ;i<nums.length;i++){
            nums[i] = 0;
        }

        return nums;
    }
    public static void main(String[] args) {
       int[] arr = {0,3,4,0,6};
       for(int n :getRes(arr)){
           System.out.print(n);
       }

    }
}
