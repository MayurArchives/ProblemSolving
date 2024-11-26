import java.io.*;
import java.util.*;

public class day4_ques2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Integer arrInteger[] = new Integer[n];
        for (int i = 0; i < n; i++) {
            arrInteger[i] = arr[i];
        }
        Arrays.sort(arrInteger, Collections.reverseOrder());
        for (int num : arrInteger) {
            System.out.print(num + " ");
        }
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
    }
}