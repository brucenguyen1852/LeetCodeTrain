package Array;

import java.util.Arrays;

public class Duplicate_Zeros {
    // ==================================================================================
    // Given a fixed-length integer array arr, duplicate each occurrence of zero,
    // shifting the remaining elements to the right.

    // Note that elements beyond the length of the original array are not written.
    // Do the above modifications to the input array in place and do not return
    // anything.

    // Example 1:
    // Input: arr = [1,0,2,3,0,4,5,0]
    // Output: [1,0,0,2,3,0,0,4]
    // Explanation: After calling your function, the input array is modified to:
    // [1,0,0,2,3,0,0,4]
    // Example 2:
    // Input: arr = [1,2,3]
    // Output: [1,2,3]
    // Explanation: After calling your function, the input array is modified to:
    // [1,2,3]
    // ==================================================================================
    public static void main(String[] args) {
        int[] arr1 = { 1, 0, 2, 3, 0, 4, 5, 0 };
        int[] arr2 = { 1, 2, 3 };

        duplicateZeros(arr1);
        System.out.println(Arrays.toString(arr1)); // Output: [1, 0, 0, 2, 3, 0, 0, 4]

        duplicateZeros(arr2);
        System.out.println(Arrays.toString(arr2)); // Output: [1, 2, 3]
    }

    public static void duplicateZeros(int[] arr) {
        boolean hasZero = false;

        // Check if there is at least one zero in the array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                hasZero = true;
                break;
            }
        }
        // Only proceed if there is at least one zero
        if (hasZero) {
            int n = arr.length;
            for (int i = n - 1; i >= 0; i--) {
                if (arr[i] == 0) {
                    // Shift elements to the right
                    for (int j = n - 1; j > i; j--) {
                        arr[j] = arr[j - 1];
                    }
                    // Duplicate the zero
                    if (i + 1 < n) {
                        arr[i + 1] = 0;
                    }
                }
            }
        }
    }
}
