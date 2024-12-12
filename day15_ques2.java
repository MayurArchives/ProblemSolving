import java.util.Scanner;

public class day15_ques2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        if (str1.equals(str2)) {
            System.out.println("equals");
        } else {
            System.out.println("not equals");
        }

    }

}
