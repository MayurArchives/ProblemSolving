import java.io.*;
import java.util.*;

public class day13_ques3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr1[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        int totalsum = 0;
        for (int i = 0; i < n; i++) {
            int start = i + 1;
            int end = n - i;
            int totalsubarray = start * end;
            int oddsubarray = (totalsubarray + 1) / 2;
            totalsum += arr1[i] * oddsubarray;

        }
        System.out.println(totalsum);
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
    }
}