import java.util.Scanner;

public class day30_ques4 {
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

        // Find the character with the maximum frequency
        int maxFreq = 0;
        char maxChar = 'a';

        for (int i = 0; i < 26; i++) {
            if (frequency[i] > maxFreq) {
                maxFreq = frequency[i];
                maxChar = (char) (i + 'a');
            }
        }

        // Output the character with the maximum frequency
        System.out.println(maxChar);
    }
}
