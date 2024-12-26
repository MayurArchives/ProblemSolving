import java.util.*;
import java.util.regex.*;

public class day24_ques1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine(); // Input string
        int count = 0;
        boolean number = false;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                if (!number) {
                    count++;
                    number = true;
                }
            } else {
                number = false;
            }

        }
        System.out.println(count);
    }
}
