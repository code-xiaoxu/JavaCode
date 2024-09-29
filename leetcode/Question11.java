package leetcode;

public class Question11 {
    /**
     * 盛最多水的容器
     * 已解答
     * 中等
     * 给定一个长度为 n 的整数数组 height 。有 n 条垂线，第 i 条线的两个端点是 (i, 0) 和 (i, height[i]) 。
     * 找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
     * 返回容器可以储存的最大水量。
     */
    public int maxArea(int[] height) {
        int res = 0;
        int i = 0, j = height.length - 1;
        while (i < j) {
            int left = height[i];
            int right = height[j];
            int area = (j - i) * Math.min(left, right);
            res = Math.max(area, res);
            if (left < right) {
                i++;
            } else {
                j--;
            }
        }
        return res;
    }

}
