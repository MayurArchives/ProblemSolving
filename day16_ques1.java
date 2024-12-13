import java.io.*;
import java.util.*;

public class day16_ques1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        int prefix[] = new int[n];
        prefix[0] = arr[0];
        for (int i = 1; i < n; i++) {
            if (prefix[i - 1] > arr[i]) {
                prefix[i] = prefix[i - 1];
            } else {
                prefix[i] = arr[i];
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(prefix[i]);

        }
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
    }
}