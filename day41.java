import java.io.*;
import java.util.*;

public class day41 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] freq = new int[10]; // Array to store frequency of digits 0-9
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            freq[num]++;
        }
        int maxFreq = 0;
        int result = 0;

        for (int i = 0; i < 10; i++) {
            if (freq[i] > maxFreq) {
                maxFreq = freq[i];
                result = i;
            }
        }
        System.out.println(result);
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
    }
}
