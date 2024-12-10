import java.util.Scanner;

public class day13_ques1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Input the size of the array
        int n = scanner.nextInt();

        // Step 2: Input array elements
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Step 3: Handle case when n == 3 separately
        if (n == 3) {
            if (arr[1] > arr[0] && arr[1] > arr[2]) {
                System.out.println(arr[1]);
            }
            return;
        }

        // Step 4: Traverse and find peak elements
        for (int i = 1; i < n - 1; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
