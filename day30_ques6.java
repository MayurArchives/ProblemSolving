// ?sorting apporach

import java.util.Arrays;
import java.util.Scanner;

public class day30_ques6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the two strings
        String s = sc.next();
        String t = sc.next();

        // Check if they are anagrams using the sorting method
        if (isAnagram(s, t)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static boolean isAnagram(String s, String t) {
        // If lengths are different, they cannot be anagrams
        if (s.length() != t.length()) {
            return false;
        }

        // Convert strings to character arrays and sort them
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        // Sort both arrays
        Arrays.sort(sArray);
        Arrays.sort(tArray);

        // Check if sorted arrays are the same
        return Arrays.equals(sArray, tArray);
    }
}
