import java.util.*;

public class day29_ques7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of array
        int n = sc.nextInt();
        int[] nums = new int[n];

        // Input elements of array
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Boyer-Moore Voting Algorithm
        int candidate = findMajorityElement(nums);

        // Output the result
        System.out.println(candidate);

        sc.close();
    }

    // Function to find the majority element using Boyer-Moore Voting Algorithm
    public static int findMajorityElement(int[] nums) {
        int count = 0;
        int candidate = -1;

        for (int num : nums) {
            if (count == 0) {
                candidate = num; // Set new candidate
            }
            count += (num == candidate) ? 1 : -1; // Increment count if num is the candidate, otherwise decrement
        }

        return candidate; // The candidate is the majority element
    }
}
