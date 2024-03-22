package org.example;

/**
 * @author fujintao
 *
 */
//时间复杂度：时间复杂度为O(logn) 空间复杂度为O（1）
public class minimumValueOfRotationallySortedArray {
    public int findMin(int[] nums) {
        int len = nums.length;
        int left = 0;
        int right = len - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < nums[right]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return nums[left];
    }

}
