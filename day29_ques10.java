import java.util.*;

public class day29_ques10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Reading input values
        int N = sc.nextInt();
        int target = sc.nextInt();
        int[] nums = new int[N];

        // Reading the array
        for (int i = 0; i < N; i++) {
            nums[i] = sc.nextInt();
        }

        // HashMap to store the number and its index
        HashMap<Integer, Integer> map = new HashMap<>();

        // Traverse through the array
        for (int i = 0; i < N; i++) {
            int complement = target - nums[i];

            // Check if complement exists in the map
            if (map.containsKey(complement)) {
                // If found, print the indices
                System.out.println(map.get(complement) + " " + i);
                return; // Exit as we found the solution
            }

            // Otherwise, store the current number and its index
            map.put(nums[i], i);
        }

        sc.close();
    }
}
