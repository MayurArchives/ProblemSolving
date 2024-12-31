import java.util.Scanner;

public class day28_ques7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the input
        int N = sc.nextInt(); // Size of the array
        int[] nums = new int[N];

        // Populate the array
        for (int i = 0; i < N; i++) {
            nums[i] = sc.nextInt();
        }

        // Create the prefix array
        int[] prefix = new int[N];

        // Initialize the first element of the prefix array
        prefix[0] = nums[0];

        // Fill the rest of the prefix array
        for (int i = 1; i < N; i++) {
            prefix[i] = Math.min(prefix[i - 1], nums[i]);
        }

        // Output the result
        for (int i = 0; i < N; i++) {
            System.out.println(prefix[i] + " ");
        }
    }
}
