package Array;

public class Find_Numbers_with_Even_Number_of_Digits {
    // ==================================================================================
    // Given an array nums of integers, return how many of them contain an even
    // number of digits.

    // Example 1:
    // Input: nums = [12, 345, 2, 6, 7896]
    // Output: 2
    // Explanation:
    // 12 contains 2 digits (even number of digits).
    // 345 contains 3 digits (odd number of digits).
    // 2 contains 1 digit (odd number of digits).
    // 6 contains 1 digit (odd number of digits).
    // 7896 contains 4 digits (even number of digits).
    // Therefore only 12 and 7896 contain an even number of digits.

    // Example 2:
    // Input: nums = [555, 901, 482, 1771]
    // Output: 1
    // Explanation:
    // Only 1771 contains an even number of digits.
    // ==================================================================================
    public static void main(String[] args) {
        int[] nums1 = { 12, 345, 2, 6, 7896 };
        int[] nums2 = { 555, 901, 482, 1771 };

        System.out.println("Input: nums1");
        System.out.println("Expected Output: 2");
        System.out.println("Actual Output: " + findNumbers(nums1)); // Output: 2

        System.out.println("Input: nums2");
        System.out.println("Expected Output: 1");
        System.out.println("Actual Output: " + findNumbers(nums2)); // Output: 1
    }

    // T?m s? có s? lı?ng ch? s? là s? ch?n
    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int digitCount = countDigits(nums[i]);
            System.out.println("Number: " + nums[i] + ", Digit Count: " + digitCount);
            if (digitCount % 2 == 0) {
                count++;
                System.out.println("Even Digit Count found. Current Even Count: " + count);
            }
        }
        return count;
    }

    // ğ?m s? ph?n t? c?a 1 s?
    public static int countDigits(int num) {
        int count = 0;
        while (num != 0) {
            num /= 10;
            count++;
        }
        return count;
    }
}
