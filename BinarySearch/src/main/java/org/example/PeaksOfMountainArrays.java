package org.example;
/*
* 符合下列属性的数组 arr 称为 山脉数组：
arr.length >= 3
存在 i（0 < i < arr.length - 1）使得：
arr[0] < arr[1] < ... arr[i-1] < arr[i]
arr[i] > arr[i+1] > ... > arr[arr.length - 1]
给你由整数组成的山脉数组 arr ，返回满足 arr[0] < arr[1] < ... arr[i - 1] < arr[i] > arr[i + 1] > ... > arr[arr.length - 1] 的下标 i 。
你必须设计并实现时间复杂度为 O(log(n)) 的解决方案。
*/
public class PeaksOfMountainArrays {
    public int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        int left = 1, right = n - 2, ans = 0;
//while (left < right): 这种形式通常用于开区间，即 [left, right)。在这个情况下，
// right 是不包含在搜索区间内的。这意味着当 left 和 right 相遇时，
// 实际上 right 指向的位置已经不再是搜索区间的一部分了，因此循环结束。
// 这种方式常见于查找第一个满足某个条件的元素，或者在某些情况下，防止在处理边界条件时出现无限循环。
//while (left <= right): 这种形式用于闭区间 [left, right]。在这种情况下，当 left 和 right 相遇时，
// 搜索的区间仍然有效，因此需要继续测试这个单一的元素是否是我们寻找的答案。这种方式常用于普通的二分查找，
// 例如在有序数组中查找一个特定值
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] > arr[mid + 1]) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }
}
