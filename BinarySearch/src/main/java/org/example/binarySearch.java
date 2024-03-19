package org.example;

/*
1. int mid = left + (right - left)/2;防止越界，并且+left缩小左边界的范围
2. /2 这个写法表示向下取整
3. 数组取数是用nums[]
 */
public class binarySearch {
    public int search(int[] nums, int target) {
    int len = nums.length;
    int left = 0;
    int right = len - 1;

    while( left <= right){
        int mid = left + (right - left)/2;
        if (nums[mid] == target){
            return mid;
        } else if(nums[mid] < target){
            left = mid + 1;
        } else {
            right = mid - 1;
        }
    }return -1;
}
}
