import java.io.*;
import java.util.*;

public class day20_ques4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        printConsonantIndices(str);

        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
    }

    public static void printConsonantIndices(String str) {
        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));
            if (Character.isLetter(ch) && ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
                System.out.print(i + " ");
            }
        }
    }
}