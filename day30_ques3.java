import java.util.*;

public class day30_ques3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the string
        String str = sc.next();

        // Array to store frequencies of characters
        int[] frequency = new int[26];

        // Set to maintain the order of unique characters
        LinkedHashSet<Character> order = new LinkedHashSet<>();

        // Count frequency of each character and track order
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            frequency[ch - 'a']++;
            order.add(ch);
        }

        // Print characters in the order they appear
        for (char ch : order) {
            System.out.println(ch + "-" + frequency[ch - 'a']);
        }
    }
}
