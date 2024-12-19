import java.io.*;
import java.util.*;

public class day21_ques4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch1 = sc.next().charAt(0);
        char ch2 = sc.next().charAt(0);
        int index1 = str.indexOf(ch1);
        int index2 = str.indexOf(ch2);
        int dist = Math.abs(index2 - index1) - 1;
        System.out.println(dist);
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
    }
}