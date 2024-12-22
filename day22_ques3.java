import java.util.*;

public class day22_ques3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        Arrays.sort(arr);

        int sum = arr[0] + arr[n - 1], chem = 0;

        for (int i = 0; i < n / 2; i++) {
            if (arr[i] + arr[n - 1 - i] != sum) {
                System.out.println(-1);
                return;
            }
            chem += arr[i] * arr[n - 1 - i];
        }
        System.out.println(chem);
    }
}
