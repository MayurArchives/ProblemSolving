import java.util.Scanner;

public class day28_ques1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Input array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Function call to duplicate zeros
        duplicateZeros(arr);

        // Output the modified array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void duplicateZeros(int[] arr) {
        int zeros = 0;
        int length = arr.length;

        // Count zeros to be duplicated
        for (int num : arr) {
            if (num == 0) {
                zeros++;
            }
        }

        // Traverse from the end and shift elements
        for (int i = length - 1; i >= 0; i--) {
            if (i + zeros < length) {
                arr[i + zeros] = arr[i];
            }
            if (arr[i] == 0) {
                zeros--;
                if (i + zeros < length) {
                    arr[i + zeros] = 0; // Duplicate zero
                }
            }
        }
    }
}
