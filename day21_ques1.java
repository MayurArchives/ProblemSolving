import java.io.*;
import java.util.*;

public class day21_ques1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Rotations(str);
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
    }

    public static void Rotations(String str) {
        int n = str.length();
        for (int i = 0; i < n; i++) {
            System.out.println(str.substring(n - i) + str.substring(0, n - i));
        }
    }

}