package leetcode;

import java.util.HashMap;
import java.util.Map;

public class Question169 {

    /**
     * 169. 多数元素
     * 简单
     * 相关标签
     * 相关企业
     * 给定一个大小为 n 的数组 nums ，返回其中的多数元素。多数元素是指在数组中出现次数 大于 ⌊ n/2 ⌋ 的元素。
     * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
     */
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,3,4,5,};
        System.out.println(fun(arr));
    }

    static int fun(int[] nums) {
        int res = 0;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int n : nums) {
            if (map.containsKey(n)) {
                map.put(n, map.get(n) + 1);
            } else {
                map.put(n, 1);
            }
        }
        for (Map.Entry<Integer, Integer> integerIntegerEntry : map.entrySet()) {
            if (integerIntegerEntry.getValue() > nums.length / 2) {
                res = integerIntegerEntry.getKey();
            }
        }
        return res;
    }
}