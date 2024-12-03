import java.io.*;
import java.util.*;

public class day10_ques3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String arr[] = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }
        Arrays.sort(arr, (a, b) -> (a + b).compareTo(b + a));
        if (arr[0].equals("0")) {
            System.out.print(0);
            return;
        }
        for (String num : arr) {
            System.out.print(num);
        }
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
    }
}