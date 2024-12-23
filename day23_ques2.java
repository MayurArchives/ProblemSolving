import java.util.*;

public class day23_ques2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String target = sc.nextLine();

        // Check if lengths are equal; if not, rotation is impossible
        if (str.length() != target.length()) {
            System.out.println("False");
            return;
        }

        // Concatenate the original string with itself
        String doubledStr = str + str;

        // Check if target is a substring of the concatenated string
        if (doubledStr.contains(target)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
