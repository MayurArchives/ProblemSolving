import java.io.*;
import java.util.*;

public class day7_ques1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int distintCount = 0;
        int lastNumber = Integer.MIN_VALUE;
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] != lastNumber) {
                distintCount++;
                lastNumber = arr[i];
            }
            if (distintCount == 3) {
                System.out.println(arr[i]);
                return;
            }
        }
        System.out.println(arr[n - 1]);
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
    }
}