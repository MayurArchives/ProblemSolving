import java.util.*;

public class day29_ques5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the string
        String s = sc.nextLine();

        // HashMap to store the frequency of characters
        Map<Character, Integer> frequencyMap = new HashMap<>();

        // First pass: Count the frequency of each character
        for (char c : s.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        // Second pass: Find the first character with frequency 1
        for (int i = 0; i < s.length(); i++) {
            if (frequencyMap.get(s.charAt(i)) == 1) {
                System.out.println(i); // Return the index of the first unique character
                sc.close();
                return;
            }
        }

        // If no unique character exists, return -1
        System.out.println(-1);
        sc.close();
    }
}
