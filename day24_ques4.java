import java.io.*;
import java.util.*;

public class day24_ques4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        String result = "";
        for (int i = 0; i < s1.length(); i++) {
            result += s1.charAt(i);
            result += s2.charAt(i);
        }
        System.out.println(result);
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
    }
}