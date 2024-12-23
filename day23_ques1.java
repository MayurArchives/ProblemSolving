import java.util.*;

public class day23_ques1 {
    public static boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start < end) { // Compare characters until pointers meet
            if (str.charAt(start) != str.charAt(end)) {
                return false; // Not a palindrome
            }
            start++;
            end--;
        }
        return true; // It is a palindrome
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        String[] words = sc.nextLine().split(" ");

        for (String word : words) {
            if (isPalindrome(word)) { // Check if the word is a palindrome
                System.out.println(word);
                return; // Return the first palindromic word
            }
        }

        System.out.println("empty"); // If no palindrome is found
    }
}
