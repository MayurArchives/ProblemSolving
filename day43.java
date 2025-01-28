import java.util.Scanner;

public class day43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size and elements
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Output array to store counts
        int[] result = new int[n];

        // Brute force comparison
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (i != j && nums[j] < nums[i]) {
                    count++;
                }
            }
            result[i] = count;
        }

        // Print the result
        for (int r : result) {
            System.out.print(r + " ");
        }
    }
}
