import java.io.*;
import java.util.*;

public class day23_ques5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int count = 0;
        int maxLength = Integer.MIN_VALUE;
        String maxsub = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'A') {
                for (int j = i + 1; j <= str.length(); j++) {
                    if (str.charAt(j - 1) == 'A' && j - 1 != i) {
                        count++;
                        String sub = str.substring(i, j);
                        if (sub.length() > maxLength) {
                            maxLength = sub.length();
                            maxsub = sub;
                        }
                    }
                }
            }
        }
        if (count == 0) {
            System.out.println(-1);
        } else {
            System.out.println(count);
            System.out.println(maxLength);
            System.out.println(maxsub);
            /*
             * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
             * class should be named Solution.
             */
        }
    }
}