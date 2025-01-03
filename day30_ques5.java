import java.util.Scanner;

public class day30_ques5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the string
        String str = sc.next();

        // Array to store frequencies of characters
        int[] frequency = new int[26];

        // Count frequency of each character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            frequency[ch - 'a']++;
        }

        // Find the first non-zero frequency to compare
        int commonFreq = 0;
        for (int freq : frequency) {
            if (freq > 0) {
                commonFreq = freq;
                break;
            }
        }

        // Check if all non-zero frequencies match the common frequency
        for (int freq : frequency) {
            if (freq > 0 && freq != commonFreq) {
                System.out.println(false);
                return;
            }
        }

        // If all non-zero frequencies match, return true
        System.out.println(true);
    }
}
