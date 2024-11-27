import java.io.*;
import java.util.*;

public class day6_ques1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer arr[] = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Comparator<Integer> myComparator = (a, b) -> {
            if (a % 2 == b % 2) {
                return a - b;

            } else {
                if (a % 2 == 0) {
                    return -1;
                } else {
                    return 1;
                }
            }
        };

        Arrays.sort(arr, myComparator);
        for (int num : arr) {
            System.out.print(num + " ");
        }
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
    }
}