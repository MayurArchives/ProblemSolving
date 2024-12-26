import java.io.*;
import java.util.*;

public class day24_ques3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        int np = 0;

        for (int i = 0; i < s2.length(); i++) {
            // Corrected comparison
            if (np < s1.length() && s2.charAt(i) == s1.charAt(np)) {
                np++;
            } else if (i > 0 && s2.charAt(i - 1) == s2.charAt(i)) {
                continue;
            } else {
                System.out.print("false");
                return;
            }
        }

        if (np == s1.length()) {
            System.out.print("true");
        }
    }
}
