package org.example;
/*
给你一个按照非递减顺序排列的整数数组 nums，和一个目标值 target。
请你找出给定目标值在数组中的开始位置和结束位置。
如果数组中不存在目标值 target，返回 [-1, -1]。
*/
public class theFirstAndLastPosition {
    //如果数组长度为0，或者找不到target，则直接返回{-1，-1}
    public int[] searchRange(int[] nums, int target) {
        int len = nums.length;
        if (len == 0) {
            return new int[]{-1, -1};
        }
        //新建firstPosition和lasPosition用于记录
        int firstPosition = searchFirstPosition(nums, target);
        if (firstPosition == -1) {
            return new int[]{-1, -1};
        }

        int lastPosition = searchLastPosition(nums, target);
        //返回第一次出现的位置和最后一次出现的位置
        return new int[]{firstPosition, lastPosition};
    }

    private int searchFirstPosition(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            //left < right，一定会查询到最后只剩下两个数字，然后取左边的那个
            int mid = left + (right - left) / 2;
            //为了避免死循环，此时一定是left = mid + 1，只有左边界依次+1，两数才会相遇
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        if (nums[left] == target) {
            return left;
        }
        return -1;
    }

    private int searchLastPosition(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left + 1) / 2; // 使用向上取整来避免死循环
            //右边界每次减1，直到剩下两位数
            if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid;
            }
        }
        //此时返回left或者right都可以，因为此时两数相等
        if (nums[left] == target) {
            return left;
        }
        return -1;
    }
}
