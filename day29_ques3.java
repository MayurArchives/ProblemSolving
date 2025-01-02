import java.util.*;

public class day29_ques3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the number of characters
        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        // Input the characters and split them
        String[] characters = sc.nextLine().split(" ");

        // Array to store frequencies of all ASCII characters
        int[] freq = new int[128];

        // Count frequencies
        for (String ch : characters) {
            char c = ch.charAt(0);
            freq[c]++; // Increment frequency of the character
        }

        // Output frequencies
        for (int i = 0; i < 128; i++) {
            if (freq[i] > 0) {
                System.out.println((char) i + " " + freq[i]);
            }
        }

        sc.close();
    }
}
