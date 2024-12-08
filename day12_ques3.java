import java.util.*;

public class day12_ques3 {
    public static int minSum(int n, int[] nums, int k) {
        // Step 1: Create a boolean array to mark existing numbers
        int maxNum = 10 * 9; // Based on constraints, this is a safe assumption for number ranges
        boolean[] present = new boolean[maxNum + 1];

        // Step 2: Mark the numbers that exist in nums
        for (int num : nums) {
            if (num <= maxNum) {
                present[num] = true;
            }
        }

        // Step 3: Find the k missing numbers and calculate the sum
        int sum = 0;
        int current = 1;
        int count = 0;

        // Step 4: Iterate and find missing numbers
        while (count < k) {
            if (!present[current]) {
                sum += current;
                count++;
            }
            current++;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input reading
        int n = scanner.nextInt(); // Length of nums
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        int k = scanner.nextInt(); // Number of integers to append

        // Output the result
        System.out.println(minSum(n, nums, k));
    }
}
