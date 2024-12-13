import java.io.*;
import java.util.*;

public class day16_ques4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] freq = new int[10]; // Array to store frequency of digits 0-9
        while (n > 0) {
            int digit = n % 10;
            freq[digit]++;
            n /= 10;
        }
        int maxfreq = 0;
        int maxfreqdigit = 0;
        for (int i = 0; i < 10; i++) {
            if (freq[i] > maxfreq) {
                maxfreq = freq[i];
                maxfreqdigit = i;
            }
        }
        System.out.println(maxfreqdigit);
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
    }
}