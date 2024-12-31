import java.util.Scanner;

public class day28_ques4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read input
        int n = sc.nextInt(); // Size of the array
        int[] nums = new int[n];

        // Fill the array
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Call the function to find the pivot index
        int result = pivotIndex(nums);

        // Output the result
        System.out.println(result);
    }

    // Function to find the pivot index
    public static int pivotIndex(int[] nums) {
        int totalSum = 0;
        int leftSum = 0;

        // Calculate the total sum of the array
        for (int num : nums) {
            totalSum += num;
        }

        // Iterate through the array and find the pivot index
        for (int i = 0; i < nums.length; i++) {
            // Right sum is calculated as totalSum - leftSum - nums[i]
            int rightSum = totalSum - leftSum - nums[i];

            // Check if the left sum equals the right sum
            if (leftSum == rightSum) {
                return i; // Return the pivot index
            }

            // Update the left sum by adding the current element
            leftSum += nums[i];
        }

        // If no pivot index is found, return -1
        return -1;
    }
}
