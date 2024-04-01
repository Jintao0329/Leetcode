package org.example;

/**
 * @program: Leetcode
 * @description:给你一个 山脉数组 mountainArr，请你返回能够使得 mountainArr.get(index) 等于 target 最小 的下标 index 值。
 * 如果不存在这样的下标 index，就请返回 -1。
 * 何为山脉数组？如果数组 A 是一个山脉数组的话，那它满足如下条件：
 * 首先，A.length >= 3
 * 其次，在 0 < i < A.length - 1 条件下，存在 i 使得：
 * A[0] < A[1] < ... A[i-1] < A[i]
 * A[i] > A[i+1] > ... > A[A.length - 1]
 **/

//public class FindingTargetValueInMountains {
//    public int findInMountainArray(int target, MountainArray mountainArr) {
//        int left = 0, right = mountainArr.length() - 1, peak = 0;
//        while (left <= right) {
//            int mid = left + (right - left) / 2;
//            if (mountainArr.get(mid) > mountainArr.get(mid + 1)) {
//                right = mid - 1;
//            } else {
//                left = mid + 1;
//            }
//        }
//        peak = left;
//        // Search in the ascending part
//        left = 0;
//        right = peak;
//        while (left <= right) {
//            int mid = left + (right - left) / 2;
//            int midValue = mountainArr.get(mid);
//            if (midValue == target) {
//                return mid;
//            } else if (midValue < target) {
//                left = mid + 1;
//            } else {
//                right = mid - 1;
//            }
//        }
//
//        // Search in the descending part
//        left = peak;
//        right = mountainArr.length() - 1;
//        while (left <= right) {
//            int mid = left + (right - left) / 2;
//            int midValue = mountainArr.get(mid);
//            if (midValue == target) {
//                return mid;
//            } else if (midValue > target) {
//                left = mid + 1;
//            } else {
//                right = mid - 1;
//            }
//        }
//
//        return -1;
//
//
//    }
//}
