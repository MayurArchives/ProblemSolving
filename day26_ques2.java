import java.util.*;

public class day26_ques2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        Arrays.sort(nums);
        boolean found = false;
        for (int i = 0; i < N; i++) {
            if (nums[i] == target) {
                System.out.print(i + " ");
                found = true;
            }
        }

        // Step 3: If target not found, print -1
        if (!found) {
            System.out.println(-1);
        }

    }
}
