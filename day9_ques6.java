import java.io.*;
import java.util.*;

public class day9_ques6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for (int i = 0; i < n - 1; i += 2) {
            int temp = arr[i + 1];
            arr[i + 1] = arr[i];
            arr[i] = temp;
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
    }
}