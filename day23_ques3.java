import java.util.Scanner;

public class day23_ques3 {
    public static boolean isPalindrome(String str) {
        str = str.toLowerCase().replaceAll("[^a-z0-9]", ""); // Clean the string

        int start = 0;
        int end = str.length() - 1;

        while (start < end) { // Compare characters from both ends
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
        String str = sc.nextLine();
        System.out.println(isPalindrome(str));
    }
}
