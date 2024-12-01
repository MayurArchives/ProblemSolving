import java.util.*;

public class day9_ques4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int original = sc.nextInt();
        while (contains(nums, original)) {
            original *= 2;
        }
        System.out.println(original);
    }

    private static boolean contains(int[] nums, int original) {
        for (int num : nums) {
            if (num == original) {
                return true;
            }
        }
        return false;
    }
}
