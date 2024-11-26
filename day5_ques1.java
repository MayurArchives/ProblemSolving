import java.io.*;
import java.util.*;

public class day5_ques1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer arr[] = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr, new myComparator());
        for (int num : arr) {
            System.out.print(num + " ");
        }

        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
    }

    public static class myComparator implements Comparator<Integer> {
        public int compare(Integer a, Integer b) {
            return a * a * a - b * b * b;
        }
    }
}