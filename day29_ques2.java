import java.util.*;

public class day29_ques2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read input strings
        String s = sc.nextLine();
        String t = sc.nextLine();

        // If the lengths are different, they can't be anagrams
        if (s.length() != t.length()) {
            System.out.println("false");
            return;
        }

        // Frequency map to count the occurrences of each character in s and t
        int[] charCount = new int[26]; // Array for counting characters (assuming lowercase English letters)

        // Count characters in string s
        for (char c : s.toCharArray()) {
            charCount[c - 'a']++;
        }

        // Subtract the count for characters in string t
        for (char c : t.toCharArray()) {
            charCount[c - 'a']--;
        }

        // If all counts are 0, then they are anagrams
        for (int count : charCount) {
            if (count != 0) {
                System.out.println("false");
                return;
            }
        }

        // If we get here, the strings are anagrams
        System.out.println("true");
    }
}
