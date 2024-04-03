package org.example;

/**
 * @program: Leetcode
 * @description:给你一个非负整数 x ，计算并返回 x 的 算术平方根 。
 *
 * 由于返回类型是整数，结果只保留 整数部分 ，小数部分将被 舍去 。
 *
 * 注意：不允许使用任何内置指数函数和算符，例如 pow(x, 0.5) 或者 x ** 0.5 。
 * @author: Jintao
 * @create: 2024-04-03 20:28
 **/
public class SquareRootOfX {
    public int mySqrt(int x) {
        if (x ==0){
            return 0;
        }
        if (x == 1) {
            return 1;
        }
        int left = 1, right = x/2;
        while (left <= right){
            int mid = left + (right - left)/2;
            //mid * mid > X,容易溢出
            if (mid > x/mid){
                right = mid -1;
            }else{
                left = mid +1;
            }
        }
        return right;


    }
}
