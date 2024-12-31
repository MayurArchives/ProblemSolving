import java.util.HashMap;
import java.util.Scanner;

public class day28_ques3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read input
        int n = sc.nextInt(); // Size of the array
        int[] nums = new int[n];

        // Fill the array
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Call the function to get the sum of unique elements
        int result = uniqueSum(nums);

        // Output the result
        System.out.println(result);
    }

    // Function to find the sum of unique elements
    public static int uniqueSum(int[] nums) {
        // Map to store the frequency of each element
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        // Count the frequency of each element
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Calculate the sum of elements that appear exactly once
        int sum = 0;
        for (int num : freqMap.keySet()) {
            if (freqMap.get(num) == 1) {
                sum += num;
            }
        }

        return sum;
    }
}
