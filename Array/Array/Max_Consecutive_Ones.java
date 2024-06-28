package Array;

public class Max_Consecutive_Ones {
    // ==================================================================================
    // Given a binary array nums, return the maximum number of consecutive 1's in
    // the array.

    // Example 1:

    // Input: nums = [1,1,0,1,1,1]
    // Output: 3
    // Explanation: The first two digits or the last three digits are consecutive
    // 1s. The maximum number of consecutive 1s is 3.
    // Example 2:

    // Input: nums = [1,0,1,1,0,1]
    // Output: 2
    // ==================================================================================
    public static void main(String[] args) {
        int[] nums = { 1, 1, 0, 1, 1, 1 };
        int maxCount = 0;
        int currentCount = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                currentCount++;
                // System.out.println("nums[" + i + "] = 1, currentCount = " + currentCount);
            } else {
                // System.out.println("nums[" + i + "] = 0, currentCount = " + currentCount);
                if (currentCount > maxCount) {
                    maxCount = currentCount;
                    // System.out.println("New maxCount = " + maxCount);
                }
                currentCount = 0;
            }
        }

        // Ki?m tra l?n cu?i ð? xem xét chu?i 1 liên ti?p cu?i cùng
        if (currentCount > maxCount) {
            maxCount = currentCount;
            // System.out.println("Final maxCount after loop = " + maxCount);
        }
        // System.out.println("Maximum number of consecutive 1s: " + maxCount);
    }
}
