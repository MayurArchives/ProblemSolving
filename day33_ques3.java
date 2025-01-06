import java.util.Scanner;

public class day33_ques3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input size of the array
        int n = scanner.nextInt();
        int[] nums = new int[n];

        // Input array elements
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        // Input number of subarrays
        int k = scanner.nextInt();

        // Find and print the minimized largest sum
        System.out.println(minimizedLargestSum(nums, k));
        scanner.close();
    }

    public static int minimizedLargestSum(int[] nums, int k) {
        int low = 0, high = 0;

        // Determine the initial range for binary search
        for (int num : nums) {
            low = Math.max(low, num); // Maximum element in the array
            high += num; // Sum of all elements in the array
        }

        // Binary search
        while (low < high) {
            int mid = low + (high - low) / 2;

            if (canSplit(nums, k, mid)) {
                high = mid; // Try to minimize the largest sum
            } else {
                low = mid + 1; // Increase the candidate sum
            }
        }

        return low;
    }

    // Check if the array can be split into k subarrays with the largest sum <=
    // target
    public static boolean canSplit(int[] nums, int k, int target) {
        int count = 1; // Start with one subarray
        int currentSum = 0;

        for (int num : nums) {
            // If adding num exceeds the target, start a new subarray
            if (currentSum + num > target) {
                count++;
                currentSum = num;

                // If more than k subarrays are needed, return false
                if (count > k) {
                    return false;
                }
            } else {
                currentSum += num;
            }
        }

        return true;
    }
}
