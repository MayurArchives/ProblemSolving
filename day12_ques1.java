import java.io.*;
import java.util.*;

public class day12_ques1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int nums[] = new int[n];
            for (int j = 0; j < n; j++) {
                nums[j] = sc.nextInt();

            }
            shiftZeros(nums);
            for (int num : nums) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
    }

    public static void shiftZeros(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }
}