
import java.util.*;

public class day29_ques13 {
    public static int minEatingSpeed(int[] piles, int h) {
        int left = 1, right = Arrays.stream(piles).max().getAsInt(); // Define search space
        int result = right;

        while (left <= right) {
            int mid = left + (right - left) / 2; // Midpoint of the search space
            if (canFinish(piles, h, mid)) {
                result = mid; // Update result
                right = mid - 1; // Try for smaller speed
            } else {
                left = mid + 1; // Increase the speed
            }
        }

        return result;
    }

    private static boolean canFinish(int[] piles, int h, int k) {
        int hours = 0;
        for (int pile : piles) {
            hours += (pile + k - 1) / k; // Equivalent to Math.ceil(pile / k)
            if (hours > h)
                return false; // Early exit if hours exceed limit
        }
        return hours <= h;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of array
        int n = sc.nextInt();
        int[] piles = new int[n];

        // Input array elements
        for (int i = 0; i < n; i++) {
            piles[i] = sc.nextInt();
        }

        // Input h (hours available)
        int h = sc.nextInt();

        // Output the result
        System.out.println(minEatingSpeed(piles, h));

        sc.close();
    }
}
