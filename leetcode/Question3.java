package leetcode;

import java.util.HashSet;
import java.util.Set;

public class Question3 {
    /**
     * 给定一个未排序的整数数组 nums ，找出数字连续的最长序列（不要求序列元素在原数组中连续）的长度。
     * <p>
     * 输入：nums = [100,4,200,1,3,2]
     * 输出：4
     * 解释：最长数字连续序列是 [1, 2, 3, 4]。它的长度为 4。
     */
    int getLen(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int res = 0; //记录结果
        int len = 0; //子序列长度
        for (int n : nums) {
            set.add(n);
        }  // 1 3 4 6
        for (int num : set) {
            if (!set.contains(num - 1)) {
                len = 1;
                while (set.contains(++num)) {
                    len++;
                }
                res = Math.max(res, len);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1,5,4,2,6};
        System.out.println(new Question3().getLen(arr));
    }
}

