import java.io.*;
import java.util.*;

public class day8_ques1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int start = 0;
        int end = n - 1;
        boolean t1 = true;

        while (start < end) {
            if (t1) {
                start++;
            } else {
                end--;
            }
            t1 = !t1;
        }
        System.out.println(arr[start]);
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
    }
}