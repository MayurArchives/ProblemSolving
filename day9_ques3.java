import java.io.*;
import java.util.*;

public class day9_ques3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] candies = new int[n];
        for (int i = 0; i < n; i++) {
            candies[i] = sc.nextInt();
        }
        int extraCandies = sc.nextInt();
        int maxCandies = Integer.MIN_VALUE;
        for (int candy : candies) {
            if (candy > maxCandies) {
                maxCandies = candy;
            }
        }
        String[] result = new String[n];
        for (int i = 0; i < n; i++) {
            if (candies[i] + extraCandies >= maxCandies) {
                result[i] = "true";
            } else {
                result[i] = "false";
            }
        }
        System.out.println(String.join(" ", result));
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
    }
}