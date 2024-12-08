import java.util.Scanner;

public class day12_ques4 {
    public static int dominantIndex(int[] nums) {
        int max = 0;

        // Step 1: Find the index of the largest element
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[max]) {
                max = i;
            }
        }

        // Step 2: Check if the largest element is at least twice as large as all other
        // elements
        for (int i = 0; i < nums.length; i++) {
            if (i != max && nums[max] < 2 * nums[i]) {
                return -1;
            }
        }

        // Step 3: Return the index of the largest element
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the input values
        int n = sc.nextInt(); // Length of the array
        int[] nums = new int[n];

        // Reading the elements of the array
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Output the result
        System.out.println(dominantIndex(nums));
    }
}
