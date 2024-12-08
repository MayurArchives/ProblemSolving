import java.io.*;
import java.util.*;

public class day12_ques2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int flowerbed[] = new int[n];
        for (int i = 0; i < n; i++) {
            flowerbed[i] = sc.nextInt();

        }
        int k = sc.nextInt();
        System.out.println(canPlaceFlower(flowerbed, k));
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
    }

    public static boolean canPlaceFlower(int[] flowerbed, int k) {
        int n = flowerbed.length;
        for (int i = 0; i < n; i++) {
            if (flowerbed[i] == 0) {
                boolean leftE = (i == 0) || (flowerbed[i - 1] == 0);
                boolean rightE = (i == n - 1) || (flowerbed[i + 1] == 0);
                if (leftE && rightE) {
                    flowerbed[i] = 1;
                    k--;
                    if (k == 0) {
                        return true;
                    }
                }
            }
        }
        return k <= 0;
    }
}