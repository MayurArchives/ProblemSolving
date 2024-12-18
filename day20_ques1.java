import java.util.Scanner;

public class day20_ques1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String name = s.nextLine();
        String[] str = name.split("\\s+"); // Use "\\s+" to handle multiple spaces
        System.out.println(str.length);
    }
}
