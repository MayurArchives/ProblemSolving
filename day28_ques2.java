public

import java.util.Scanner;

public class day28_ques2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read input
        int n = sc.nextInt();
        int[] plants = new int[n];
        for (int i = 0; i < n; i++) {
            plants[i] = sc.nextInt();
        }
        int capacityA = sc.nextInt();
        int capacityB = sc.nextInt();

        // Call the function to calculate the number of refills
        int result = wateringPlants(plants, capacityA, capacityB);
        
        // Output the result
        System.out.println(result);
    }

    public static int wateringPlants(int[] plants, int capacityA, int capacityB) {
        int n = plants.length;
        int refillCount = 0;
        
        int waterA = capacityA; // Alice's initial water amount
        int waterB = capacityB; // Bob's initial water amount
        
        int i = 0, j = n - 1; // Alice starts at 0, Bob starts at n-1
        
        while (i <= j) {
            if (i <= j) {
                // Alice waters plant at i
                if (waterA >= plants[i]) {
                    waterA -= plants[i];
                } else {
                    refillCount++;
                    waterA = capacityA - plants[i];
                }
                i++;
            }

            if (i <= j) {
                // Bob waters plant at j
                if (waterB >= plants[j]) {
                    waterB -= plants[j];
                } else {
                    refillCount++;
                    waterB = capacityB - plants[j];
                }
                j--;
            }
        }

        return refillCount;
    }
}day28_ques2{

}
