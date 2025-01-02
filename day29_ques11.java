import java.util.*;

public class day29_ques11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        HashMap<Integer, Integer> freqMap = new HashMap<>();

        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        int operations = 0;

        // Iterate over each unique element in the map
        for (int num : freqMap.keySet()) {
            int complement = k - num;

            // Check if the complement exists in the map
            if (freqMap.containsKey(complement)) {
                // If num == complement, we need at least two instances of num to make a pair
                if (num == complement) {
                    operations += freqMap.get(num) / 2; // Pair up as many as possible
                } else {
                    // Take the minimum of the count of num and complement
                    operations += Math.min(freqMap.get(num), freqMap.get(complement));
                }
                // After pairing, remove both elements from the map
                freqMap.put(num, 0); // Set the count of num to 0
                freqMap.put(complement, 0); // Set the count of complement to 0
            }
        }

        // Output the number of operations
        System.out.println(operations);

        sc.close();
    }
}
