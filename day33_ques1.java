import java.util.Scanner;

public class day33_ques1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Size of the array and the array elements
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        // Binary search for the single element
        int low = 0, high = n - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;

            // Ensure mid is even for pairing logic
            if (mid % 2 == 1) {
                mid--;
            }

            // Check if the current mid and mid+1 form a pair
            if (nums[mid] == nums[mid + 1]) {
                // Pair is correct, move to the right
                low = mid + 2;
            } else {
                // Pair is broken, move to the left
                high = mid;
            }
        }

        // `low` will point to the single element
        System.out.println(nums[low]);
        scanner.close();
    }
}
