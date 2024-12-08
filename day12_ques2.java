import java.util.Scanner;

public class day12_ques2 {
    public static int findFinalValue(int[] nums, int original) {
        // Step 1: Repeat the process until original is not found in nums
        while (contains(nums, original)) {
            original *= 2; // Multiply original by 2
        }
        return original; // Return the final value of original
    }

    // Helper function to check if original is present in the array
    public static boolean contains(int[] nums, int original) {
        for (int num : nums) {
            if (num == original) {
                return true; // Return true if original is found
            }
        }
        return false; // Return false if original is not found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the input
        int n = sc.nextInt(); // Length of the array
        int[] nums = new int[n];

        // Reading the elements of the array
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int original = sc.nextInt(); // The initial value of original

        // Output the result
        System.out.println(findFinalValue(nums, original));
    }
}
