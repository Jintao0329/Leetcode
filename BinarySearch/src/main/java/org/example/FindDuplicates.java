package org.example;

/**
 * @program: Leetcode
 * @description: 给定一个包含 n + 1 个整数的数组 nums ，其数字都在 [1, n] 范围内（包括 1 和 n），
 * 可知至少存在一个重复的整数。  假设 nums 只有 一个重复的整数 ，返回 这个重复的数 。
 * 你设计的解决方案必须 不修改 数组 nums 且只用常量级 O(1) 的额外空间。
 * @author: Jintao
 * @create: 2024-04-03 20:50
 * 在一个长度为 n 的数组中，如果没有重复的数字，那么数字的范围应该是从 1 到 n-1。如果数组中有一个重复的数字，
 * 那么当我们计算小于或等于中间数（mid）的数字的个数时，如果没有重复，这个数量应该等于mid。如果数量多于mid，
 * 那么重复的数字应该在[1, mid]范围内。如果少于或等于mid，那么重复的数字在[mid+1, n-1]范围内。
 * 代码通过不断缩小搜索范围来找到这个重复的数字。
 **/
public class FindDuplicates {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        int l = 1, r = n - 1, ans = -1;
        while (l <= r) {
            int mid = l + (r - l)/2;
            int cnt = 0;
            for (int i = 0; i < n; ++i) {
                if (nums[i] <= mid) {
                    cnt++;
                }
            }
            if (cnt <= mid) {
                l = mid + 1;
            } else {
                r = mid - 1;
                ans = mid;
            }
        }
        return ans;

    }
}
