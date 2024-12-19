import java.io.*;
import java.util.*;

public class day21_ques2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch[] = str.toCharArray();
        Arrays.sort(ch);
        int count = 1;
        for (int i = 1; i < ch.length; i++) {
            if (ch[i - 1] == ch[i]) {
                continue;
            } else {
                count++;
            }
        }
        System.out.println(count);
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
    }
}