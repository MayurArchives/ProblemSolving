import java.io.*;
import java.util.*;

public class day22_ques2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        int largest = Integer.MIN_VALUE;
        int index = -1;
        for (int i = 0; i < n; i++) {
            if (nums[i] > largest) {
                largest = nums[i];
                index = i;
            }
        }
        boolean isTwice = true;
        for (int i = 0; i < n; i++) {
            if (i != index && largest < 2 * nums[i]) {
                isTwice = false;
                break;
            }
        }
        System.out.println(isTwice ? index : -1);

        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
    }
}