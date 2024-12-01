import java.io.*;
import java.util.*;

public class day9_ques5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i <= n - k; i++) {
            if (arr[i + k - 1] - arr[i] < min) {
                min = arr[i + k - 1] - arr[i];
            }
        }
        System.out.println(min);
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
    }
}