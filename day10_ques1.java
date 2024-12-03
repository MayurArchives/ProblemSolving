import java.io.*;
import java.util.*;

public class day10_ques1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int height[] = new int[n];
        for (int i = 0; i < n; i++) {
            height[i] = sc.nextInt();
        }
        System.out.println(mismatch(height, n));
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
    }

    public static int mismatch(int height[], int n) {
        int expected[] = Arrays.copyOf(height, n);
        Arrays.sort(expected);
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (height[i] != expected[i]) {
                count++;
            }
        }
        return count;
    }
}