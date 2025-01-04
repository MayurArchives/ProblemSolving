import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class day31_ques1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the size of the array
        int n = sc.nextInt();
        int[] nums = new int[n];

        // Read the array elements
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Use a set to find unique positive numbers
        Set<Integer> uniquePositives = new HashSet<>();
        for (int num : nums) {
            if (num > 0) {
                uniquePositives.add(num);
            }
        }

        // The number of unique positive numbers is the answer
        System.out.println(uniquePositives.size());
    }
}
