import java.util.Scanner;

public class day28_ques6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read input
        int n = sc.nextInt(); // Size of the array
        int[] nums = new int[n];

        // Fill the array
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Call the function to find the leftmost middle index
        int result = findMiddleIndex(nums);

        // Output the result
        System.out.println(result);
    }

    // Function to find the leftmost middle index
    public static int findMiddleIndex(int[] nums) {
        int totalSum = 0;
        int leftSum = 0;

        // Calculate the total sum of the array
        for (int num : nums) {
            totalSum += num;
        }

        // Iterate through the array to find the middle index
        for (int i = 0; i < nums.length; i++) {
            // Calculate the right sum dynamically
            int rightSum = totalSum - leftSum - nums[i];

            // Check if left sum equals right sum
            if (leftSum == rightSum) {
                return i; // Return the leftmost middle index
            }

            // Update the left sum by adding the current element
            leftSum += nums[i];
        }

        // If no such index exists, return -1
        return -1;
    }
}
