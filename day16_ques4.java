import java.io.*;
import java.util.*;

public class day16_ques4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] freq = new int[10];
        for (int i = 0; i < n; i++) {
            freq[arr[i]]++;
        }
        int larg = -1;
        for (int i = 1; i < 10; i++) {
            if (freq[i] == i) {
                larg = i;
            }
        }
        System.out.println(larg);
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
    }
}