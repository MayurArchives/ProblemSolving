import java.util.Scanner;

public class day17_ques1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the size of the array
        int N = sc.nextInt();

        // If size is 0, no elements to process
        if (N == 0) {
            System.out.println("There is no odd occurring element");
            return;
        }

        // Read the array elements
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        // Frequency array for numbers 0 to 9
        int[] freq = new int[10];

        // Count frequency of each element
        for (int i = 0; i < N; i++) {
            freq[arr[i]]++;
        }

        // Find the element that occurs odd number of times
        boolean found = false;
        for (int i = 0; i < 10; i++) {
            if (freq[i] % 2 != 0) {
                System.out.println(i);
                found = true;
                break;
            }
        }

        // If no odd frequency element is found
        if (!found) {
            System.out.println("There is no odd occurring element");
        }
    }
}
