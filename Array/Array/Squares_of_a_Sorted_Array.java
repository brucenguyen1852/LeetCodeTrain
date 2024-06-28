package Array;

import java.util.*;

public class Squares_of_a_Sorted_Array {
    // ==================================================================================
    // Given an array nums of integers, return how many of them contain an even
    // number of digits.

    // Example 1:

    // Input: nums = [12,345,2,6,7896]
    // Output: 2
    // Explanation:
    // 12 contains 2 digits (even number of digits).
    // 345 contains 3 digits (odd number of digits).
    // 2 contains 1 digit (odd number of digits).
    // 6 contains 1 digit (odd number of digits).
    // 7896 contains 4 digits (even number of digits).
    // Therefore only 12 and 7896 contain an even number of digits.
    // Example 2:

    // Input: nums = [555,901,482,1771]
    // Output: 1
    // Explanation:
    // Only 1771 contains an even number of digits.
    // ==================================================================================
    public static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int left = 0;
        int right = n - 1;
        int position = n - 1;

        while (left <= right) {
            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                result[position] = nums[left] * nums[left];
                left++;
            } else {
                result[position] = nums[right] * nums[right];
                right--;
            }
            position--;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = { -4, -1, 0, 3, 10 };
        System.out.println(Arrays.toString(sortedSquares(nums1))); // Output: [0, 1, 9, 16, 100]

        int[] nums2 = { -7, -3, 2, 3, 11 };
        System.out.println(Arrays.toString(sortedSquares(nums2))); // Output: [4, 9, 9, 49, 121]
    }
}
