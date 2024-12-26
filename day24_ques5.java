import java.io.*;
import java.util.*;

public class day24_ques5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(reversedLetter(s));

        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
    }

    public static String reversedLetter(String s) {
        char arr[] = s.toCharArray();// convert string to character
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            if (!Character.isLetter(arr[left])) {
                left++;
            } else if (!Character.isLetter(arr[right])) {
                right--;
            } else {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }

        }
        return new String(arr); // conver character array back to string
    }
}